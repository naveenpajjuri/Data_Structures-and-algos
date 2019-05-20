import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Naveen Pajjuri on 20/05/19.
 */
public class TopologicalSort {
	public static void TopologicalSortaGraph(Graph g) {
		int [] inArray = inDegree(g);
//		for (int i =0;i < inArray.length; i++) {
//			System.out.println(inArray[i]);
//		}
		Queue<Integer> q = new LinkedList<>();
		for (int i =0;i < inArray.length; i++) {
			if (inArray[i] == 0) {
				q.add(i);
			}
		}
		int [] visited = new int[inArray.length];
		while (q.size() > 0) {
			int deQueueElemet = q.poll();
			visited[deQueueElemet] = 1;
			System.out.print(deQueueElemet+ " -- ");
			LinkedList<Integer> deQueueList = g.adjList[deQueueElemet];
			for (int i = 0; i < deQueueList.size();i++) {
				inArray[deQueueList.get(i)] = inArray[deQueueList.get(i)] -1;
				if (inArray[deQueueList.get(i)] == 0 && visited[deQueueList.get(i)] != 1) {
					q.add(deQueueList.get(i));
				}

			}
		}
	}


	private static int[] inDegree(Graph g) {
		int[] inDegree = new int[g.adjList.length];
		for (int i = 0; i < g.adjList.length; i ++) {
			for (int j = 0 ; j < g.adjList[i].size(); j++) {
				inDegree[g.adjList[i].get(j)] = inDegree[g.adjList[i].get(j)]+1;
			}
		}
		return inDegree;
	}

	public static void main(String args[]){
		Graph g = new Graph(6);
		g.populateDirectedGraph();
		TopologicalSortaGraph(g);
	}
}

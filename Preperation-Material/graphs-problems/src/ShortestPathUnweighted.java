import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Naveen Pajjuri on 20/05/19.
 */
public class ShortestPathUnweighted {

	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.createGraph();
		int [] weights = shoratestPathToAllNodes(1,g);
		for(int i = 0;i < weights.length;i++) {
			System.out.println("distance to "+i+" is "+weights[i]);
		}
	}

	private static int[] shoratestPathToAllNodes(int position, Graph g) {
		int [] weights = new int[g.adjList.length];
		for (int i = 0;i < weights.length; i++) {
			weights[i] = -1;
		}
		Queue<Integer> q = new LinkedList();
		weights[position] = 0;
		q.add(position);
		while(q.size() > 0){
			int front = q.poll();
			for (int i =0; i < g.adjList[front].size(); i++) {
				if(weights[g.adjList[front].get(i)] == -1) {
					weights[g.adjList[front].get(i)] = weights[front]+1;
					q.add(g.adjList[front].get(i));
				}
			}
		}
		return weights;
	}
}

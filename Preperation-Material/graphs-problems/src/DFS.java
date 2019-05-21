import java.util.Iterator;

/**
 * Created by Naveen Pajjuri on 19/05/19.
 */
public class DFS {

	public static void doDFS(Graph g, int v) {
		boolean[] isVisited = new boolean[g.adjList.length];
		DFSUtil(g,v,isVisited);
	}

	private static void DFSUtil(Graph g, int v, boolean[] isVisited) {
		// start at vertex v and mark it visited
		isVisited[v] = true;
		System.out.println("visited "+ v);
		Iterator<Integer> itr = g.adjList[v].iterator();
		while(itr.hasNext()){
			int n = itr.next();
			if (!isVisited[n])
				DFSUtil(g,n,isVisited);
		}
	}

	public static void main (String args[]) {
		Graph g = new Graph(4);
		g.populateGraph();
		g.printGraph();
		doDFS(g,2);
	}
}

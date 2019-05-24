package graphs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Naveen Pajjuri on 19/05/19.
 */
public class BFS {

	public static void doBFS(Graph g, int source) {
		boolean [] isVisisted = new boolean[g.adjList.length];
		LinkedList<Integer> queue = new LinkedList<>();
		isVisisted[source] = true;
		queue.add(source);

		while (queue.size() > 0) {
			int head = queue.poll();
			System.out.println(head);
			Iterator<Integer> itr = g.adjList[head].iterator();
			while(itr.hasNext()) {
				int itrHead = itr.next();
				if(!isVisisted[itrHead]) {
					queue.add(itrHead);
					isVisisted[itrHead] = true;
				}
			}
		}
	}

	public static void main(String args[]) {
		Graph g = new Graph(4);
		g.populateGraph();
		doBFS(g,2);
	}
}

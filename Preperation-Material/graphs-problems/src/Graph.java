import java.util.LinkedList;

/**
 * Created by Naveen Pajjuri on 19/05/19.
 */
public class Graph {
	public int numberOfVertices;
	public LinkedList<Integer> [] adjList;

	Graph(int v) {
		adjList = new LinkedList[v];
		for(int i = 0; i < v;i++){
			adjList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int x, int y) {
		adjList[x].add(y);
		adjList[y].add(x);
	}

	public void addDirectedEdge(int x, int y) {
		adjList[x].add(y);
	}

	public void populateGraph() {
		addEdge(0, 1);
		addEdge(0, 2);
		addEdge(1, 2);
		addEdge(2, 0);
		addEdge(2, 3);
		addEdge(3, 3);
	}

	public void populateDirectedGraph() {
		addDirectedEdge(5, 2);
		addDirectedEdge(5, 0);
		addDirectedEdge(4, 0);
		addDirectedEdge(4, 1);
		addDirectedEdge(2, 3);
		addDirectedEdge(2, 1);
		//addDirectedEdge(1, 2);
		//addDirectedEdge(2, 0);
		//addDirectedEdge(2, 3);
		//addDirectedEdge(0, 3);
		//addDirectedEdge(3, 3);
	}

	public void createGraph() {
		this.populateGraph();
	}

	public void createDirectedGraph() {
		this.populateDirectedGraph();
	}

	public void printGraph() {
		for (int i = 0; i < adjList.length;i++) {
			System.out.print("vertex "+ i + "  corresponding edges :- ");
			for (int j =0; j < adjList[i].size(); j++) {
				System.out.print(adjList[i].get(j) +" ");
			}
			System.out.println();
		}
	}
}

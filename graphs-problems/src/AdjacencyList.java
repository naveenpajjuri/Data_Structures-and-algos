import java.util.LinkedList;

/**
 * Created by Naveen Pajjuri on 19/05/19.
 */
public class AdjacencyList  {

	static class Graph {
		public int numberOfVertices;
		public LinkedList<Integer>[] linkArray;
		Graph(int numberOfVertices) {
			this.numberOfVertices = numberOfVertices;
			linkArray = new LinkedList[numberOfVertices];
			for (int i = 0; i < numberOfVertices; i++) {
				linkArray[i] = new LinkedList<Integer>();
			}
		}

		static void addEdge(Graph g, int x, int y){
			g.linkArray[x].add(y);
			g.linkArray[y].add(x);
		}
		static void printGraph(Graph g){
			for (int i = 0 ; i < g.linkArray.length; i++) {
				System.out.print("vertex  "+ i + " and edges are");
				for (int j = 0; j < g.linkArray[i].size(); j++) {
					System.out.print(" : "+ g.linkArray[i].get(j));
				}
				System.out.println(" ");
			}
		}
	}

	public static void main(String args[])
	{
		// create the graph given in above figure
		int V = 5;
		Graph graph = new Graph(V);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 4);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 1, 4);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 3, 4);

		// print the adjacency list representation of
		// the above graph
		graph.printGraph(graph);

		System.out.println("end -- "+ graph.linkArray.length);
	}
}
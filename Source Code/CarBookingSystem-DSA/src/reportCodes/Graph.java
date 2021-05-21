package reportCodes;
import java.util.*;

public class Graph {
	
		static void addEdge(ArrayList<ArrayList<Integer> > adj,
							int u, int v)
		{
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		static void printGraph(ArrayList<ArrayList<Integer> > adj)
		{
			for (int e = 0; e < adj.size(); e++) {
				System.out.println("\nlist of vertex - " + e);
				System.out.print("Start");
				for (int f = 0; f < adj.get(e).size(); f++) {
					System.out.print(" -> "+adj.get(e).get(f));
				}
				System.out.println();
			}
		}
		public static void main(String[] args)
		{
			// Creating a graph with 5 vertices
			int V = 5;
			ArrayList<ArrayList<Integer> > adj
						= new ArrayList<ArrayList<Integer> >(V);
			
			for (int i = 0; i < V; i++)
				adj.add(new ArrayList<Integer>());
			addEdge(adj, 0, 1);
			addEdge(adj, 0, 4);
			addEdge(adj, 1, 2);
			addEdge(adj, 1, 3);
			addEdge(adj, 1, 4);
			addEdge(adj, 2, 3);
			addEdge(adj, 3, 4);
			printGraph(adj);
		}
	}


package app;

import java.util.HashMap;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Graph graph = new Graph( new HashMap<Integer, List<Integer>>());
        // Adding vertexes
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(4);
        graph.addVertex(7);
        graph.addVertex(12);
        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(4, 7);
        graph.addEdge(4, 12);
        graph.addEdge(7, 12);
        graph.addEdge(1, 12);
        graph.addEdge(1, 2);
        //Print graph
        graph.printGraph();

        System.out.println("\nDoes graph has a vertex 1:" + graph.hasVertex(1));
        System.out.println("Does graph has a vertex 3:" + graph.hasVertex(3));

        System.out.println("\nDoes graph has an edge 4-7:" + graph.hasEdge(4, 7));
        System.out.println("Does graph has an edge 2-7:" + graph.hasEdge(12, 7));
        //Removing vertex 1
        graph.removeVertex(1);
        System.out.println("\nDoes graph has a vertex 1:" + graph.hasVertex(1));
        //Removing edge between 4 - 7
        graph.removeEdge(4,7);
        System.out.println("\nDoes graph has an edge 4-7:" + graph.hasEdge(4, 7));

    }
}

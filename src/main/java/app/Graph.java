package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    Map<Integer, List<Integer>> graph;

    public Graph(Map<Integer, List<Integer>> graph) {
        this.graph = graph;
    }

    void addVertex(int vertex){
        graph.put(vertex, new ArrayList<Integer>());
    }
    void addEdge(int source, int destination){
        graph.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
    }
    void removeVertex(int vertex){
        graph.remove(vertex);
        for (List<Integer> edges : graph.values()) {
            edges.remove(Integer.valueOf(vertex));
        }
    }
    void removeEdge(int source, int destination){
        List<Integer> edges = graph.get(source);
        if (edges != null) {
            edges.remove(Integer.valueOf(destination));
        }
    }
    boolean hasVertex(int vertex){
        return graph.containsKey(vertex);
    }
    boolean hasEdge(int source, int destination){
        List<Integer> edges = graph.get(source);
        return edges != null && edges.contains(destination);
    }

    void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            System.out.print("Vertex " + entry.getKey() + " has edges with: ");
            if (entry.getValue().isEmpty()) {
                System.out.print("no one");
            }
            else {
                for (Integer edge : entry.getValue()) {
                    System.out.print(edge + " ");
                }
            }
            System.out.println();
        }
    }
}

package com.interview.preparation.dsa.datastructures.O9_graph;

import java.util.*;

public class GraphTraversal {

    public void DFS(Graph<Integer> graph){
        Set<Long> visited = new HashSet<>();
        System.out.println("DFS==========");
        for(Vertex vertex: graph.getAllVertex()){
            if(!visited.contains(vertex.id)){
                DFSUtil(vertex, visited);
            }
        }
        System.out.println("");
    }

    private void DFSUtil(Vertex vertex, Set<Long> visited){
        visited.add(vertex.id);
        System.out.print(vertex.id + "  ");
        List<Vertex> vertexList = (List)vertex.getAllAdjacentVertex();
        for(Vertex vrtx: vertexList){
            if(!visited.contains(vrtx.id)){
                DFSUtil(vrtx, visited);
            }
        }
    }

    public void BFS(Graph<Integer> graph){
        System.out.println("BFS==========");
        Set<Long> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        for(Vertex vertex: graph.getAllVertex()){
            if(!visited.contains(vertex.id)) {
                queue.add(vertex);
                visited.add(vertex.id);
                while (!queue.isEmpty()) {
                    Vertex vrtx = queue.poll();
                    System.out.print(vrtx.id + "  ");
                    List<Vertex> vrtxs = vrtx.getAllAdjacentVertex();
                    for (Vertex v : vrtxs) {
                        if (!visited.contains(v.id)) {
                            queue.add(v);
                            visited.add(v.id);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>(true);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(4,6);
        graph.addEdge(6,5);
        graph.addEdge(5,3);

        GraphTraversal traversal = new GraphTraversal();
        traversal.DFS(graph);

        traversal.BFS(graph);

    }
}

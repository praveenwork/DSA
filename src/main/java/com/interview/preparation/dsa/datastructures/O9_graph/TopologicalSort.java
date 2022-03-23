package com.interview.preparation.dsa.datastructures.O9_graph;

import java.util.*;

public class TopologicalSort {

    public Deque<Vertex> topSort(Graph graph){
        Deque<Vertex> stack = new ArrayDeque<>();
        Set<Vertex> visited = new HashSet<>();
        Collection<Vertex> vertexList =  graph.getAllVertex();
        for(Vertex vertex:vertexList){
            if(!visited.contains(vertex)){
                topSortUtil(vertex, stack, visited);
            }
        }
        return stack;
    }

    private void topSortUtil(Vertex vertex, Deque<Vertex> stack, Set<Vertex> visited){
        visited.add(vertex);
        List<Vertex> adjVertexList = vertex.getAllAdjacentVertex();
        for (Vertex vrtx : adjVertexList ) {
            if(!visited.contains(vrtx)){
                topSortUtil(vrtx, stack,  visited);
            }
        }
        stack.offerFirst(vertex);
    }
    public static void main(String[] args) {
        Graph graph = new Graph(true);
        /*graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(5, 6);
        graph.addEdge(6, 3);
        graph.addEdge(3, 8);
        graph.addEdge(8, 11);*/

        graph.addEdge(1, 0);
        graph.addEdge(2, 0);
        graph.addEdge(3, 0);
        //graph.addEdge(3, 2);

        TopologicalSort topologicalSort = new TopologicalSort();
        Deque<Vertex> stack = topologicalSort.topSort(graph);
        while(!stack.isEmpty()) {
            System.out.print(stack.pollLast().getId()+ "  ");
        }
    }
}

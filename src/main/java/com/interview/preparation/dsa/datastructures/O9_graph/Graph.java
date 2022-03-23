package com.interview.preparation.dsa.datastructures.O9_graph;

import java.util.*;

public class Graph<T> {
    private List<Edge<T>> allEdges;
    private Map<Long, Vertex<T>> allVertex;
    boolean isDirected = false;

    public Graph(boolean isDirected){
        this.isDirected = isDirected;
        allEdges = new ArrayList<>();
        allVertex = new HashMap<>();
    }
    private void addAdjacentNode(Node destination, int distance){}

    public void addEdge(long id1, long id2){
        addEdge(id1, id2, 0);
    }

    public void addEdge(long id1, long id2, int weight){
        Vertex<T> vertex1 = null;
        Vertex<T> vertex2 = null;
        //vertex 1
        if(allVertex.containsKey(id1)){
            vertex1 = allVertex.get(id1);
        } else {
            vertex1 = new Vertex<T>(id1);
            allVertex.put(id1, vertex1);
        }

        //vertex 2
        if(allVertex.containsKey(id2)){
            vertex2 = allVertex.get(id2);
        } else {
            vertex2 = new Vertex<T>(id2);
            allVertex.put(id2, vertex2);
        }

        // add Edge
        Edge<T> edge =  new Edge<>(vertex1, vertex2, this.isDirected, weight);
        allEdges.add(edge);

        //add adjacent Vertex
        vertex1.addAdjacentVertex(edge, vertex2);
        if(!isDirected){
            vertex2.addAdjacentVertex(edge, vertex1);
        }
    }

    //Add Vertex
    public void addVertex(Vertex<T> vertex){
        if(allVertex.containsKey(vertex)){
            return;
        }
        allVertex.put(vertex.id, vertex);
        for(Edge<T> edge: vertex.getAllEdges()){
            allEdges.add(edge);
        }
    }

    //Add Single Vertex
    public Vertex<T> addSingleVertex(long id){
        if(allVertex.containsKey(id)){
            return allVertex.get(id);
        }
        Vertex<T> vertex = new Vertex<>(id);
        allVertex.put(id, vertex);
        return vertex;
    }

    public Vertex<T> getVertex(long id){
        return allVertex.get(id);
    }

    public List<Edge<T>> getAllEdges(){
        return allEdges;
    }

    public Collection<Vertex<T>> getAllVertex(){
        return allVertex.values();
    }

    public void setDataForVertex(long id, T data){
        if(allVertex.containsKey(id)){
            Vertex<T> vertex = allVertex.get(id);
            vertex.setData(data);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Edge<T> edge: allEdges){
            sb.append(edge.getVertex1()+ "  "+ edge.getVertex2() + " "+  edge.getWeight());
            sb.append("\n");
        }
        return  sb.toString();
    }
}

class Vertex<T>{
    long id;
    private T data;
    private List<Edge<T>> edges = new ArrayList<>();
    private List<Vertex<T>> adjacentVertex = new ArrayList<>();

    public Vertex(long id){
        this.id = id;
    }

    public void addAdjacentVertex(Edge<T> edge, Vertex<T> vertex){
        edges.add(edge);
        adjacentVertex.add(vertex);
    }
    public List<Vertex<T>> getAllAdjacentVertex(){
        return adjacentVertex;
    }

    public List<Edge<T>> getAllEdges(){
        return edges;
    }

    public T getData(){
        return data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Edge<T>> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge<T>> edges) {
        this.edges = edges;
    }

    public List<Vertex<T>> getAdjacentVertex() {
        return adjacentVertex;
    }

    public void setAdjacentVertex(List<Vertex<T>> adjacentVertex) {
        this.adjacentVertex = adjacentVertex;
    }
}

class Edge<T>{
    private boolean isDirected = false;
    private Vertex<T> vertex1;
    private Vertex<T> vertex2;
    private int weight;

    public Edge(Vertex<T> vertex1, Vertex<T> vertex2, boolean isDirected, int weight){
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.isDirected = isDirected;
        this.weight = weight;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public void setDirected(boolean directed) {
        isDirected = directed;
    }

    public Vertex<T> getVertex1() {
        return vertex1;
    }

    public void setVertex1(Vertex<T> vertex1) {
        this.vertex1 = vertex1;
    }

    public Vertex<T> getVertex2() {
        return vertex2;
    }

    public void setVertex2(Vertex<T> vertex2) {
        this.vertex2 = vertex2;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}



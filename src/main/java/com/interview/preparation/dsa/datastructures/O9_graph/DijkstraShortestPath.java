package com.interview.preparation.dsa.datastructures.O9_graph;


import java.util.*;

public class DijkstraShortestPath {

    private GraphData shortestPath(GraphData graph, Node source){
        source.setDistance(0);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();
        unsettledNodes.add(source);

        while(unsettledNodes.size()!= 0){
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for(Map.Entry<Node, Integer> adjPair : currentNode.getAdjacentNodes().entrySet()){
                Node adjNode = adjPair.getKey();
                Integer adjWeight = adjPair.getValue();

                if(!settledNodes.contains(adjNode)){
                    calculateMinimumDistance(adjNode, adjWeight, currentNode);
                    unsettledNodes.add(adjNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }

    private void calculateMinimumDistance(Node evalNode, Integer weight, Node sourceNode){
        Integer sourceDistance = sourceNode.getDistance();
        if(sourceDistance + weight < evalNode.getDistance()){
            evalNode.setDistance(sourceDistance + weight);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evalNode.setShortestPath(shortestPath);
        }
    }


    private Node getLowestDistanceNode(Set<Node> unsettledNodes){
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for(Node node: unsettledNodes){
            int nodeDistance = node.getDistance();
            if(nodeDistance < lowestDistance){
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);


        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        GraphData graph = new GraphData();
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        DijkstraShortestPath dijkstraShortestPath = new DijkstraShortestPath();
        GraphData  graphData = dijkstraShortestPath.shortestPath(graph, nodeA);
        System.out.println(graphData);
    }

}


class GraphData {
    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node node){
        nodes.add(node);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }
}
class Node{
    private String name;

    private LinkedList<Node> shortestPath = new LinkedList<>();

    private Integer distance = Integer.MAX_VALUE;

    private Map<Node, Integer> adjacentNodes = new HashMap<>();

    public Node(String name){
        this.name = name;
    }

    public void addDestination(Node destination, int distance){
        adjacentNodes.put(destination, distance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(LinkedList<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }
}



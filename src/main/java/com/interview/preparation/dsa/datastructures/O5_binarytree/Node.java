package com.interview.preparation.dsa.datastructures.O5_binarytree;

public class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }

    public boolean insertNode(Node root, int data){
        if(root == null){
            Node newNode = new Node(data);
            root = newNode;
        }
        return false;
    }
}

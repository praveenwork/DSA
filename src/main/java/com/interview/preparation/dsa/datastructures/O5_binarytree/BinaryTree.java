package com.interview.preparation.dsa.datastructures.O5_binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    BinaryTree(int data){
        root = new Node(data);
    }

    BinaryTree(){
        this.root = null;
    }

    private void insertNode(int data){
        if(root == null){
            root = new Node(data);
            return;
        }
        Node current = root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(current);

        while(!queue.isEmpty()) {
            current = queue.peek();
            queue.remove();

            //left Node
            if (current.left == null) {
                current.left = new Node(data);
                break;
            } else {
                queue.add(current.left);
            }

            //right Node
            if (current.right == null) {
                current.right = new Node(data);
                break;
            } else {
                queue.add(current.right);
            }
        }
    }

    private void preOrderTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    private void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    private void postOrderTraversal(Node node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.insertNode(20);
        binaryTree.insertNode(30);
        binaryTree.insertNode(40);
        binaryTree.insertNode(50);


        System.out.println("\nPre Order: " );
        binaryTree.preOrderTraversal(binaryTree.root);

        System.out.println("\nIn Order: " );
        binaryTree.inOrderTraversal(binaryTree.root);

        System.out.println("\nPost Order: " );
        binaryTree.postOrderTraversal(binaryTree.root);

    }
}

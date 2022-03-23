package com.interview.preparation.dsa.datastructures.O5_binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDeleteNode {
    Node root = null;

    private boolean deleteDeepestNode(Node root, Node deleteNode){

        Queue<Node> queue = new LinkedList<>();
        Node currentNode = root;
        queue.add(currentNode);

        while(!queue.isEmpty()){
            currentNode = queue.peek();
            queue.remove();

            if(currentNode == deleteNode){
                currentNode = null;
                return true;
            }
            if(currentNode.left != null){
                if(currentNode.left == deleteNode){
                    currentNode.left = null;
                }else{
                    queue.add(currentNode.left);
                }
            }

            if(currentNode.right != null) {
                if(currentNode.right == deleteNode){
                    currentNode.right = null;
                }else{
                    queue.add(currentNode.right);
                }
            }

        }

        return false;
    }

    private boolean deleteNode(Node node, int data){
        // no nodes
        if(node == null) {
            return true;
        }
        // only root node
        if(node.left == null && node.right == null){
            if(node.data == data) {
                node = null;
                return true;
            }else{
                return false;
            }
        }

        //Find the node to delete
        //Fine the deepest node
        // Replace node with Deepest node
        // delete deepest node

        Queue<Node> queue = new LinkedList<>();
        Node currentNode = root;

        Node searchNode = null;
        queue.add(currentNode);
        while(!queue.isEmpty()){
            currentNode = queue.peek();
            queue.remove();

            if(currentNode.data == data){
                searchNode = currentNode;
            }

            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        if(searchNode != null){
            int lastNodeData = currentNode.data;
            deleteDeepestNode(root, currentNode);
            searchNode.data = lastNodeData;
        }
        return false;
    }

    private void insertNode(int data){
        if(root == null){
            root = new Node(data);
            return;
        }

        Node currentNode  = root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(currentNode);

        while(!queue.isEmpty()){
            currentNode = queue.peek();
            queue.remove();

            if(currentNode.left == null) {
                currentNode.left = new Node(data);
                break;
            } else {
                queue.add(currentNode.left);
            }

            if(currentNode.right == null){
                currentNode.right = new Node(data);
                break;
            } else {
                queue.add(currentNode.right);
            }
        }
    }

    private void inOrderTraversal(Node node){
        if(node == null){
          return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + "  ");
        inOrderTraversal(node.right);
    }
    public static void main(String[] args) {
        BinaryTreeDeleteNode bTree = new BinaryTreeDeleteNode();
        bTree.insertNode(10);
        bTree.insertNode(20);
        bTree.insertNode(30);
        bTree.insertNode(40);
        bTree.insertNode(50);

        System.out.println("\n InOder Tree traversal:");
        bTree.inOrderTraversal(bTree.root);

        System.out.println("Delete node: 20 " );
        bTree.deleteNode(bTree.root, 20);
        System.out.println("\n InOder Tree traversal:");
        bTree.inOrderTraversal(bTree.root);

    }
}

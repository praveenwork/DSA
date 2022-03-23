package com.interview.preparation.dsa.datastructures.O5_binarytree;


import java.util.LinkedList;
import java.util.Queue;

//Size = Tree left Tree count + 1 + root right sub Tree count
public class TreeSize {

    Node root;


    private void insertNode(int data){
        if(root == null){
            root = new Node(data);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        Node currentNode = root;
        queue.add(currentNode);

        while(!queue.isEmpty()){
            currentNode = queue.peek();
            queue.remove();

            if(currentNode.left == null){
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

    private void traverse(Node node){
        if(node == null) {
            return;
        }
        traverse(node.left);
        System.out.print(node.data+ " ");
        traverse(node.right);
    }


    private void leftViewOnly(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        Node currentNode = root;
        queue.add(currentNode);
        while(!queue.isEmpty()){

            int levelNodeCount = queue.size();

            for(int i = 1; i<=levelNodeCount; i++){
                Node node = queue.poll();
                if(i == 1){
                    System.out.println(node.data);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }

    }
    private int size(Node node){
        if(node == null){
            return 0;
        }
        return (size(node.left) + 1 + size(node.right));
    }

    private int findMax(Node node){
        if(node == null){
            return  Integer.MIN_VALUE;
        }
        int result = node.data;
        int leftResult = findMax(node.left);
        int rightResult = findMax(node.right);
        if(leftResult > result){
            result = leftResult;
        }
        if(rightResult > result){
            result = rightResult;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeSize treeSize = new TreeSize();
        treeSize.insertNode(10);
        treeSize.insertNode(20);
        treeSize.insertNode(30);
        treeSize.insertNode(40);
        treeSize.insertNode(50);
        treeSize.insertNode(60);
        treeSize.insertNode(70);
        treeSize.insertNode(80);
        treeSize.insertNode(90);
        treeSize.insertNode(100);
        treeSize.insertNode(110);
        treeSize.insertNode(120);
        treeSize.insertNode(130);
        treeSize.insertNode(140);
        treeSize.insertNode(150);

        treeSize.traverse(treeSize.root);

        System.out.println("\nsize:"+treeSize.size(treeSize.root));
        System.out.println("\nMax:"+treeSize.findMax(treeSize.root));

        treeSize.leftViewOnly(treeSize.root);

        Node rootNode = new Node(4);
        rootNode.left = new Node(5);
        rootNode.right = new Node(2);
        rootNode.right.left = new Node(3);
        rootNode.right.right = new Node(1);
        rootNode.right.left.left = new Node(6);
        rootNode.right.left.right = new Node(7);

        treeSize.leftViewOnly(rootNode);
        rootNode = null;

        rootNode = new Node(1);
        rootNode.left = new Node(2);
        rootNode.right = new Node(3);
        rootNode.left.right = new Node(4);
        rootNode.left.right.right = new Node(5);
        rootNode.left.right.right.right = new Node(6);

        treeSize.leftViewOnly(rootNode);
    }


}

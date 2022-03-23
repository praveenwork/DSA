package com.interview.preparation.dsa.datastructures.O2_linkedlist;


public class LinkedListExample {
    Node head;

    private void insertAtFront(Node n) {
        n.next = head;
        head = n;
    }

    private void insertAtEnd(Node n){
        if( head == null){
            head = n;
        } else {
            Node node = head;
            while(node.next != null){
                node = node.next;
            }
            node.next = n;
        }
    }


    public static void main(String[] args) {
        Node firstNode  = new Node(1);
        Node secondNode  = new Node(2);
        Node thirdNode  = new Node(3);

        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.head = firstNode;
        linkedListExample.head.next = secondNode;
        secondNode.next = thirdNode;

        Node n = linkedListExample.head;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }

    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

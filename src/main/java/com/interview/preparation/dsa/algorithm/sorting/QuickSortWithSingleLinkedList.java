package com.interview.preparation.dsa.algorithm.sorting;

public class QuickSortWithSingleLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    Node head;
    Node last;

    private void addNode(int data){
        if(head == null){
            head = new Node(data);
            last = head;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
        last = current.next;
    }

    private void printNode(){

        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    private Node partitionLast(Node start, Node end){
        Node pivot_prev = start;
        Node current = start;
        int pivot = end.data;

        while(start != end){
            if(start.data < pivot){
                pivot_prev = current;
                int temp= current.data;
                current.data = start.data;
                start.data = temp;
                current = current.next;
            }
            start = start.next;
        }

        int temp = current.data;
        current.data =pivot;
        end.data = temp;
        return pivot_prev;
    }

    private void sort(Node start, Node end){
        Node pivot_prev = partitionLast(start, end);
        sort(start, pivot_prev);

        if(pivot_prev != null && pivot_prev == start){
            sort(pivot_prev.next, end);
        }
        else if ( pivot_prev != null && pivot_prev.next != null){
            sort(pivot_prev.next.next, end);
        }
    }


    public static void main(String[] args) {
        QuickSortWithSingleLinkedList quickSortWithSingleLinkedList = new QuickSortWithSingleLinkedList();
        quickSortWithSingleLinkedList.addNode(30);
        quickSortWithSingleLinkedList.addNode(3);
        quickSortWithSingleLinkedList.addNode(4);
        quickSortWithSingleLinkedList.addNode(20);
        quickSortWithSingleLinkedList.addNode(5);

        quickSortWithSingleLinkedList.printNode();
        quickSortWithSingleLinkedList.sort(quickSortWithSingleLinkedList.head, quickSortWithSingleLinkedList.last);
        quickSortWithSingleLinkedList.printNode();
    }

}

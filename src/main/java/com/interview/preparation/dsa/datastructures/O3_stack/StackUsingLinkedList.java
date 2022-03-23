package com.interview.preparation.dsa.datastructures.O3_stack;

public class StackUsingLinkedList {
    Node top;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    boolean push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            return true;
        }
        newNode.next = top;
        top = newNode;
        return true;
    }

    int pop(){
        if(top == null){
            return  -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    int peek(){
        if(top == null){
            return  -1;
        }
       return top.data;
    }

    void display(){
        if(top == null){
            System.out.println("Empty Stack");
            return;
        }
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);

        stackUsingLinkedList.display();

        System.out.println("Peek:" + stackUsingLinkedList.peek());
        System.out.println("Pop:" + stackUsingLinkedList.pop());

        stackUsingLinkedList.display();

    }

}

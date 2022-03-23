package com.interview.preparation.dsa.datastructures.O4_queue;

public class QueueUsingArrays {
    int capacity;
    int front, rear, size;
    int array[];

    public QueueUsingArrays(int capacity){
        this.capacity = capacity;
        array = new int[this.capacity];
        this.front = 0;
        this.size = 0;
        this.rear = capacity-1;
    }

    private boolean enqueue(int data){
        if(array.length == capacity){
            System.out.println("Reached maximum capacity");
            return false;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.front = (this.front + 1) % this.capacity;
        array[this.rear] = data;
        this.size = this.size + 1;
        return true;
    }

    private int dequeue(){
        int data = this.array[this.front];
        this.front = (this.front+1) %this.capacity;
        this.size = this.size - 1;
        return data;
    }

    private int front(){
        return -1;
    }

    private int rear(){
        return -1;
    }

    public static void main(String[] args) {
        QueueUsingArrays queueUsingArrays = new QueueUsingArrays(10);
        queueUsingArrays.enqueue(10);
        queueUsingArrays.enqueue(20);
        queueUsingArrays.enqueue(30);

        System.out.println(queueUsingArrays.dequeue());
        System.out.println(queueUsingArrays.front());
        System.out.println(queueUsingArrays.rear());

    }
}
interface Foo{
    int x =10;
}
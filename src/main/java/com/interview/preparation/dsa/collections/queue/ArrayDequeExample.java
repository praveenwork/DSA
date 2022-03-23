package com.interview.preparation.dsa.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(1);
        arrayDeque.addFirst(5);
        arrayDeque.addLast(10);
        arrayDeque.add(299);
        arrayDeque.offer(300);

        System.out.println(arrayDeque);

        //remove

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
    }
}

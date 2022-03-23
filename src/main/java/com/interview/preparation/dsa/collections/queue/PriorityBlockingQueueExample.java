package com.interview.preparation.dsa.collections.queue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();
        priorityBlockingQueue.add(100);
        priorityBlockingQueue.add(100);
        priorityBlockingQueue.add(100);

        System.out.println(priorityBlockingQueue);
        System.out.println(priorityBlockingQueue.peek());
        System.out.println(priorityBlockingQueue.remove(100));
        System.out.println(priorityBlockingQueue);

        System.out.println(priorityBlockingQueue.poll());
        System.out.println(priorityBlockingQueue);
    }
}

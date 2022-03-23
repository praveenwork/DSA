package com.interview.preparation.dsa.datastructures.O4_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerWithOutBlockingQueue<E> {
    private int maxQueue;
    private Queue<E> queue = new LinkedList<>();
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public ProducerConsumerWithOutBlockingQueue(int size){
        this.maxQueue = size;
    }

    public void put(E e){
        lock.lock();
        try {
            while(queue.size() == maxQueue) {
                notFull.await();
            }
            queue.add(e);
            notEmpty.signalAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public E take(){
        lock.lock();
        E e = null;
        try {
            while(queue.size() == 0) {
                notEmpty.wait();
            }
            e = queue.remove();
            notFull.signalAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
             lock.unlock();
        }
        return e;
    }

    public static void main(String[] args) {

    }

}

package com.interview.preparation.java.multithreading;

import java.util.concurrent.RecursiveTask;

public class RecursiveTaskExample extends RecursiveTask<Integer> {

    private Integer n;
    public RecursiveTaskExample(Integer n){
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if(n <= 1){
            return n;
        }
        RecursiveTaskExample recursiveTaskExample = new RecursiveTaskExample(n-1);
        recursiveTaskExample.fork();
        return n*n+recursiveTaskExample.join();
    }

    public static void main(String[] args) {
        RecursiveTaskExample recursiveTaskExample = new RecursiveTaskExample(4);
        System.out.println(recursiveTaskExample.compute());
    }
}

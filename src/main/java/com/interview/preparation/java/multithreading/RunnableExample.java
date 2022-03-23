package com.interview.preparation.java.multithreading;



public class RunnableExample implements  Runnable {
    private int number;

    public RunnableExample(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread "+ number + " started");
        for(int i =number*100; i<= number*100 + 99; i++){
            System.out.print(number*i + " ");
        }
        System.out.print("Thread "+ number + "Done");
    }

    public static void main(String[] args) {
        RunnableExample runnableExample = new RunnableExample(10);
        Thread therad = new Thread(runnableExample);
        therad.start();
    }
}

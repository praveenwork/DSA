package com.interview.preparation.java.multithreading;


class Task extends Thread{
    private int number;

    public Task(int number){
        this.number = number;
    }
    public void run(){
        System.out.println("Thread "+ number + " started");
        for(int i =number*9; i< 10; i++){
            System.out.print(number*i + " ");
        }
        System.out.print("Thread "+ number + "Done");
    }

}
public class ThreadSample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task(10));
        Thread thread2 = new Thread(new Task(20));
        Thread thread3 = new Thread(new Task(30));
        Thread thread4 = new Thread(new Task(40));
        Thread thread5 = new Thread(new Task(50));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}

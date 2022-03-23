package com.interview.preparation.dsa.datastructures.O3_stack;

public class StackUsingArrays {
    int top = -1;
    int MAX = 100;
    int[] a = new int[MAX];

    private boolean push(int x){
        if(top >= MAX-1){
            System.out.println("Max out");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop(){
        int value = a[top--];
        return value;
    }

    int peek(){
        return a[top];
    }

    void print(){
        for(int i=top;i>-1;i--){
            System.out.print(a[i]+ " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        StackUsingArrays stackUsingArrays = new StackUsingArrays();
        stackUsingArrays.push(10);
        stackUsingArrays.push(20);
        stackUsingArrays.push(30);

        stackUsingArrays.print();
        System.out.println("pop:"+ stackUsingArrays.pop());
        System.out.println("Peek:"+ stackUsingArrays.peek());

        stackUsingArrays.print();

    }
}

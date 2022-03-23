package com.interview.preparation.dsa.collections.list;

import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.push(300);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(300);
        System.out.println(stack);

        System.out.println("element found at: "+stack.search(100));
    }
}

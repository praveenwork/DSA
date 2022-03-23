package com.interview.preparation.dsa.problemsolving.fibonacci;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
 * starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 *
 * Example1:
 *  Input: n = 2
 *  Output: 1
 *  Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 *
 * Example 2:
 *  Input: n = 3
 *  Output: 2
 *  Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 *
 * Example 3:
 *  Input: n = 4
 *  Output: 3
 *  Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 */

public class FibonacciNumber {

    //Recursive way
    public int recursiveFibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
    }

    //Dynamic programming
    public int dynamicFibonacci(int n){
        if(n == 0) return 0;
        int[] fibArray = new int[n+1];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for(int i =2;i<=n;i++){
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        return fibArray[n];
    }

    public static void main(String[] args) {
        int n = 25;
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println("Recursive Way:"+ fibonacciNumber.recursiveFibonacci(n));
        System.out.println("Dynamic Way:"+ fibonacciNumber.dynamicFibonacci(n));
    }
}

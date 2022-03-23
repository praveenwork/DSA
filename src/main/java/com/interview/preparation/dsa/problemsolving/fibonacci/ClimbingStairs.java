package com.interview.preparation.dsa.problemsolving.fibonacci;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 0) return 0;
        int[] fib = new int[n+1];
        fib[0] = 1;
        fib[1] = 1;
        for(int i= 2; i<=n;i++){
            fib[i] = fib[i-1]+ fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        int n = 10;
        ClimbingStairs  climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(n));
    }

}

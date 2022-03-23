package com.interview.preparation.dsa.problemsolving.fibonacci;

import java.util.HashMap;
/**
 * The Tribonacci sequence Tn is defined as follows:
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 *
 * Given n, return the value of Tn.
 */

public class NthTribonacciNumber {
    HashMap<Integer, Integer> nthHashMap = new HashMap<>();
    public int tribonacci(int n) {
        if(n == 0 ) return  0;
        if( n == 1 || n == 2) return 1;
        if(!nthHashMap.containsKey(n)){
            nthHashMap.put(n, tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
        }
        return nthHashMap.get(n);
    }
    public static void main(String[] args) {
        int n = 25;
        NthTribonacciNumber nthTribonacciNumber = new NthTribonacciNumber();
        System.out.println(nthTribonacciNumber.tribonacci(n));
    }
}

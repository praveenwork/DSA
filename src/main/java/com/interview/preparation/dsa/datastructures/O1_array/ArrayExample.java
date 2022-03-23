package com.interview.preparation.dsa.datastructures.O1_array;

public class ArrayExample {

    public static void main(String[] args) {
        int[] sample = new int[5];
        for (int i = 0; i < sample.length; i++) {
            sample[i] = i;
        }
        for (int i = 0; i < sample.length; i++) {
            System.out.println(sample[i]);
        }
    }
}

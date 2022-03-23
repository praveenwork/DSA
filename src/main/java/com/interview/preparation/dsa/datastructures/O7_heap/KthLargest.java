package com.interview.preparation.dsa.datastructures.O7_heap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class KthLargest {

    private static void kLargest(Integer[] arr, int k){
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<k; i++){
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1,23,12,9,30,2,50};
        int k = 3;
        kLargest(array,k);
    }
}

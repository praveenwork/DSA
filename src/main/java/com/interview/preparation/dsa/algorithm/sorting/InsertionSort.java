package com.interview.preparation.dsa.algorithm.sorting;

import java.util.LinkedHashMap;

/**
 * Time Complexity: O(n^2)
 * Auxiliary Space: O(1)
 *
 * Algorithm:
 * To sort an array of size n in ascending order:
 * 1: Iterate from arr[1] to arr[n] over the array.
 * 2: Compare the current element (key) to its predecessor.
 * 3: If the key element is smaller than its predecessor, compare it to the elements before.
 * Move the greater elements one position up to make space for the swapped element.
 */
public class InsertionSort {
    public void sort(int[] array){
        for(int i=1; i<array.length; i++){
            printArray(array);
            int temp = array[i];
            int j = i - 1;
            while(j > 0 && array[j] > temp){

                array[j +1] = array[j];
                j = j - 1;
            }
            array[j+1] = temp;
        }
    }
    public void printArray(int[] array){
        for(int i =0;i <array.length; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        insertionSort.printArray(arr);
    }

}

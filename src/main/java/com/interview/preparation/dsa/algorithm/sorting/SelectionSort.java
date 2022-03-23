package com.interview.preparation.dsa.algorithm.sorting;

/**
 * Time Complexity: O(n2) as there are two nested loops.
 * Auxiliary Space: O(1)
 */
public class SelectionSort {


    public void sort(int[] array){
        for(int i=0;i<array.length;i++){
            int min_idx = i;
            for(int j = 1; j<array.length; j++){
                if(array[j] < array[min_idx]){
                    min_idx = j;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }
    public void printArray(int[] array){
        for(int i =0;i <array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] array = {64,25,12,22,11};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        selectionSort.printArray(array);
    }
}

package com.interview.preparation.dsa.algorithm.sorting;

public class QuickSort {

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        //printArray(array);
    }

    private static int partition(int[] array, int low, int high){

        int pivot = array[high];
        int i = (low - 1);
        for(int j =low; j <= high-1; j++){
            if(array[j] < pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }


    private static void quickSort(int[] array, int low, int high){
        if(low < high){
            int p1 = partition(array, low, high);
            quickSort(array, low, p1-1);
            quickSort(array, p1+1, high);
        }
    }

    private static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] array =  { 10, 7, 8, 9, 1, 5 };
        int n = array.length;
        quickSort(array, 0, n-1);
        printArray(array);
    }
}

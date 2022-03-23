package com.interview.preparation.dsa.algorithm.sorting;

public class BubbleSort {

    public void sort(int[] array){
        for(int i=0;i<array.length-1; i++){
            for(int j=0;j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public void print(int[] array){
        for(int i =0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort.sort(array);
        bubbleSort.print(array);
    }
}

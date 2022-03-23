package com.interview.preparation.dsa.datastructures.O1_array;

public class ArrayRotation {

    private void leftRotate(int[] array, int rotate){
        for(int i =0;i<rotate; i++){
            leftRotateByOne(array);
        }
    }

    private void leftRotateByOne(int[] array){
        int temp = array[0];
        for(int i=0;i<array.length-1;i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = temp;
    }

    private void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        ArrayRotation arrayRotation = new ArrayRotation();
        arrayRotation.printArray(array);
        arrayRotation.leftRotate(array, 2);
        arrayRotation.printArray(array);

    }
}

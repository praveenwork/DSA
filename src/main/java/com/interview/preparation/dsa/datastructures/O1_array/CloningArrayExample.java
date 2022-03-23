package com.interview.preparation.dsa.datastructures.O1_array;

public class CloningArrayExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] cloneArray = arr.clone();

        System.out.println(arr == cloneArray);
        for(int i=0; i< cloneArray.length; i++){
            System.out.println(arr[i] + " = " + cloneArray[i]);
        }



        int[][] marray = {{1,2,3}, {4,5}};

        int[][] cloneMarray = marray.clone();

        for(int i =0 ;i < marray.length;i++){
            for(int j=0;j<marray[i].length;j++){
                System.out.println(marray[i][j] + " == " + cloneMarray[i][j]);
            }
        }

    }
}

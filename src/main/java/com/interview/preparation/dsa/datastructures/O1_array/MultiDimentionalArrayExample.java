package com.interview.preparation.dsa.datastructures.O1_array;

public class MultiDimentionalArrayExample {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{2,2,2},{3,3,3}};
        System.out.println(arr.length);
        for(int i =0 ;i<arr.length;i++){
            for(int j =0;j<arr[i].length; j++){
                System.out.println(i + " - " +j + "  = "+ arr[i][j]);
            }
        }
    }
}

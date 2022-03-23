package com.interview.preparation.dsa.datastructures.O1_array;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] multiArray = new int[][]{
                new int[] {10, 20, 30 ,40},
                new int[] {50, 60, 70, 80, 90, 100},
                new int[] {110, 120}
        };

        for(int i =0 ; i<multiArray.length; i++){
            for(int j=0; j<multiArray[i].length; j++){
                System.out.print(multiArray[i][j]+ "  ");
            }
            System.out.println("");
        }

        int row = 5;
        int[][] jaggedArray = new int[row][];
        for(int i =0;i< jaggedArray.length; i++){
            jaggedArray[i] = new int[i+1];
        }

        int count = 0;

        for(int i =0 ; i<jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                jaggedArray[i][j] = count++;
            }
        }

        for(int i =0 ; i<jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j]+ "  ");
            }
            System.out.println("");
        }

    }
}

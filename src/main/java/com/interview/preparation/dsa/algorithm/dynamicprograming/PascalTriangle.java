package com.interview.preparation.dsa.algorithm.dynamicprograming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

        public List<Integer> getRow(int rowIndex) {
            List<List<Integer>> triangle = generate(rowIndex);
            return triangle.get(rowIndex);
        }

        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> triangle = new ArrayList<>();

            // First Row
            triangle.add(new ArrayList<>());
            triangle.get(0).add(1);

            for(int row = 1; row <= numRows; row++){
                List<Integer> currentRow = new ArrayList<>(); // new Row
                List<Integer> prevRow = triangle.get(row-1); // Prev Row
                currentRow.add(1); // first col in row =  1

                for(int col = 1; col< row; col++){
                    currentRow.add(prevRow.get(col-1) + prevRow.get(col));
                }

                currentRow.add(1); //Last col in the Row = 1
                triangle.add(currentRow);

            }
            return triangle;
        }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.generate(5);
        List<Integer> row = pascalTriangle.getRow(3);
        for (Integer val: row) {
            System.out.print(val + "  ");
        }
    }

}

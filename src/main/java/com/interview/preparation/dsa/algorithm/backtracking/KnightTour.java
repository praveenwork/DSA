package com.interview.preparation.dsa.algorithm.backtracking;

public class KnightTour {

    private static boolean isSafe(int x, int y, int[][] sol, int n){
        if( x >= 0 && x<n && y >=0 && y<n && sol[x][y] == -1){
            return true;
        }
        return false;
    }

    private static void printSolution(int[][] sol, int n ){
        for(int i =0;i < n ;i++){
            for(int j =0;j< n ; j++){
                System.out.print(sol[i][j] + "  ");
            }
            System.out.println();
        }
    }
    private static boolean solveKT(int n){
        int[][] sol = new int[n][n];

        // initialize sol with -1;
        for(int i = 0; i< n; i++){
            for(int j = 0; j<n; j++){
                sol[i][j] = -1;
            }
        }

        //possible X and Y moves
        int[] xMove = { 2, 1, -1, -2, -2, -1, 1, 2};
        int[] yMove = { 1, 2,  2,  1, -1, -2, -2, -1};

        //starting position
        sol[0][0] = 0;

        if(!solveKTUtil(0, 0 , 1, sol, xMove, yMove, n )){
            System.out.println("Solution not exist");
            return false;
        }
        printSolution(sol, n);
        return true;
    }

    private static boolean solveKTUtil(int x, int y, int movei, int[][] sol, int[] xMove, int[] yMove, int n){

        int k , next_x, next_y;
        if(movei == n*n){
            return true;
        }

        for(k =0 ; k< 8; k++){
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if(isSafe(next_x, next_y, sol,n)){
                sol[next_x][next_y] = movei;
                if(solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove, n)){
                    return true;
                }else{
                    sol[next_x][next_y] = -1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 8;
        solveKT(n);
    }

}

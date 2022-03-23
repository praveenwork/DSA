package com.interview.preparation.dsa.algorithm.backtracking;

public class RateInaMaze {

    private static void printSolution(int[][] maze){
        for(int i =0; i< maze.length; i++){
            for(int j =0; j < maze.length; j++){
                System.out.print(maze[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int x, int y, int[][] maze){
        if( x >= 0 && x < maze.length && y >=0 && y < maze.length && maze[x][y] == 1){
            return true;
        }
        return false;
    }

    private static boolean solveMaze(int[][] maze){
        int[][] sol = new int[maze.length][maze.length];
        if(!solveMazeUtil(0,0, maze, sol)){
            System.out.println("Solution not exist");
            return false;
        }
        printSolution(sol);
        return true;
    }

    private static boolean solveMazeUtil(int x, int y, int[][] maze, int[][] sol){
        int n = maze.length;
        if(x == n-1 && y == n-1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(x,y,maze)){
            if(sol[x][y] == 1){
                return false;
            }
            sol[x][y] = 1;

            if(solveMazeUtil(x+1, y, maze, sol)){
                return true;
            }
            if(solveMazeUtil(x, y+1, maze, sol)){
                return true;
            }
            if(solveMazeUtil(x-1, y, maze, sol)){
                return true;
            }
            if(solveMazeUtil(x, y-1, maze, sol)){
                return true;
            }
            sol[x][y] = 0; //BackTracking
            return false;
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] maze = { {1,0,0,0},
                         {1,1,0,1},
                         {0,1,0,0},
                         {1,1,1,1},
                        };
        solveMaze(maze);

    }


}

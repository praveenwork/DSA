package com.interview.preparation.dsa.problemsolving.techniques.twopointer;

/**
 * 977. Squares of a Sorted Array
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * Example 1:
 *      Input: nums = [-4,-1,0,3,10]
 *      Output: [0,1,9,16,100]
 *      Explanation: After squaring, the array becomes [16,1,0,9,100].
 *      After sorting, it becomes [0,1,9,16,100].
 *
 *  Example 2:
 *      Input: nums = [-7,-3,2,3,11]
 *      Output: [4,9,9,49,121]
 */
public class SquaresOfASortedArray {

    public int[] sortedSquared(int[] nums){
        if(nums ==null || nums.length ==0) return null;
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] result = new int[n];
        for(int i = n-1; i>=0;i--){
            int square = 0;
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                square = nums[right];
                right--;
            } else{
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11 };
        for(int val: nums){
            System.out.print(val + " ");
        }
        System.out.println();
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] result = squaresOfASortedArray.sortedSquared(nums);
        for(int val: result){
            System.out.print(val + " ");
        }
    }
}

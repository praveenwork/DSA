package com.interview.preparation.dsa.problemsolving.techniques.slidingwindow;

import java.util.Hashtable;

/**
 *  LeetCode: 485, 487, 1004.
 *  Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.
 *  Example 1:
 *      Input: nums = [1,0,1,1,0]
 *      Output: 4
 *      Explanation: Flip the first zero will get the maximum number of consecutive 1s. After flipping, the maximum number of consecutive 1s is 4.
 *
 *  Example 2:
 *      Input: nums = [1,0,1,1,0,1]
 *      Output: 4
 */
public class MaxConsecutiveOnes {

    private static int slidingWindow(int[] nums){
        int longestSequence = 0;
        int left = 0;
        int right = 0;
        int numZeros = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                numZeros++;
            }
            while(numZeros == 2){
                if(nums[left] == 0){
                    numZeros--;
                }
                left++;
            }
            longestSequence = Math.max(longestSequence, right-left+1);
            right++;
        }
        return longestSequence;
    }

    private static int bruteForce(int[] nums){
        int longestSequence = 0;
        for(int left =0 ; left < nums.length; left++){
            int numZeros = 0;
            for(int right = left; right<nums.length; right++){
                if(nums[right] == 0){
                    numZeros += 1;
                }
                if(numZeros <=1){
                    longestSequence = Math.max(longestSequence, right-left+1);
                }
            }
        }
        return longestSequence;
    }

    public static void main(String[] args) {
        int nums[] = {1,0,1,1,0};
        int maxBruteForce = bruteForce(nums);
        System.out.println(maxBruteForce);

        int maxSlidingWindow = slidingWindow(nums);
        System.out.println(maxSlidingWindow);
    }
}

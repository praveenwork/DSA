package com.interview.preparation.dsa.datastructures.O1_array;

import java.util.HashSet;
/**
 *  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *  Example 1:
 *      Input: nums = [1,2,3,1]
 *      Output: true
 *
 *  Example 2:
 *      Input: nums = [1,2,3,4]
 *      Output: false
 *
 *  Example 3:
 *      Input: nums = [1,1,1,3,3,4,3,2,4,2]
 *      Output: true
 */

public class ContainsDuplicates {

    private boolean hasDuplicates(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i< nums.length; i++){
            if(!hashSet.add(nums[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        ContainsDuplicates  containsDuplicates = new ContainsDuplicates();
        System.out.println(containsDuplicates.hasDuplicates(nums));
    }
}

package com.interview.preparation.dsa.datastructures.O1_array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    private static int[] twoSumHashMap(int[] nums, int target){
        Map<Integer, Integer> numStore = new HashMap<>();
        for(int i =0 ;i< nums.length;i++){
            if(numStore.containsKey(target-nums[i])){
                return new int[]{numStore.get(target-nums[i]), i};
            }else{
                numStore.put(nums[i], i);
            }
        }
        return new int[]{};
    }
    private static int[] twoSum(int[] nums, int target){
        int result[] ;
        for(int i =0;i< nums.length;i++){
           for(int j = 1;j<nums.length; j++){
               if(nums[i] + nums[i+1] == target){
                   result = new int[]{i, j};
                   return result;
               }
           }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;
        int[] result = twoSumHashMap(num,target);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}

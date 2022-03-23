package com.interview.preparation.dsa.datastructures.O1_array;

import java.util.*;

public class ThreeSum {

    private static List<List<Integer>> threeSumOptimized(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        //sort the array
        Arrays.sort(nums);
        for(int i =0; i+2 < nums.length; i++){
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length -1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if( sum == 0){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    while( j < k && nums[k] == nums[k+1]) k--;
                } else if(sum > 0){
                    k--;
                } else{
                    j++;
                }
            }
        }

        return result;
    }

    private static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0; i< nums.length;i++){
            for (int j =i+1; j<nums.length;j++){
                for(int k = j+1; k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> found = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(found);
                        result.add(found);
                    }
                }
            }
        }
        result = new ArrayList < List < Integer >> (new LinkedHashSet< List < Integer >>(result));
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSumOptimized(nums);

            System.out.println(result);

    }
}

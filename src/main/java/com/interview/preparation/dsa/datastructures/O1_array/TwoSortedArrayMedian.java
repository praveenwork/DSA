package com.interview.preparation.dsa.datastructures.O1_array;

public class TwoSortedArrayMedian {

    private int getMax(int[] nums, int partition){
        if(partition == 0) {
            return (int)Double.NEGATIVE_INFINITY;
        }
        return nums[partition-1];
    }

    private int getMin(int[] nums, int partition){
        if(partition == nums.length){
            return (int)Double.POSITIVE_INFINITY;
        }
        return nums[partition];
    }

    private double median(int[] nums1, int[] nums2){
        if(nums1.length > nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int lo = 0;
        int hi = nums1.length;
        int combLength = nums1.length+ nums2.length;

        while(lo <= hi){
            int pointX = (lo+hi)/2;
            int pointY = (combLength+1)/2 -pointX;

            int leftX = getMax(nums1, pointX);
            int leftY = getMin(nums1, pointX);

            int rightX = getMax(nums2, pointY);
            int rightY = getMin(nums2, pointY);

            if(leftX <= rightY && leftY <= rightX){
                if(combLength %2 == 0){
                    return  ((Math.max(leftX,leftY) + (Math.min(rightX, rightY)))/2.0);
                }
                return Math.max(leftX,leftY);
            }
            if(leftX > rightY){
                hi = pointX - 1;
            }else {
                lo = pointX + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        TwoSortedArrayMedian twoSortedArrayMedian = new TwoSortedArrayMedian();
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {-1,0,0,1};
        double median =  twoSortedArrayMedian.median(nums1, nums2);
        System.out.println("Median:"+median);
    }
}

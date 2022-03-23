package com.interview.preparation.dsa.datastructures.O1_array;

public class SortedArrayMerge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = nums1.length - 1;

        while (p1 >= 0 && p2 >= 0 && p >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            }
            else if(nums1[p1] <= nums2[p2]) {
                nums1[p--] = nums2[p2--];
            }
        }

        while (p2>=0 && p>=0) {
            nums1[p--] = nums2[p2--];
        }

        for(int i =0 ;i< nums1.length;i++){
            System.out.print( nums1[i]);
        }
        System.out.println(" ");
        for(int i =0 ;i< nums2.length;i++){
            System.out.print( nums2[i]);
        }
    }
    public static void main(String[] args) {
        SortedArrayMerge sortedArrayMerge = new SortedArrayMerge();
        int[] first = {1,2,3};
        int[] second = {4,5};

        sortedArrayMerge.merge(first, 3, second, 2);

    }

}

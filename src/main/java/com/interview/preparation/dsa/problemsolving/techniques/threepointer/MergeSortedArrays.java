package com.interview.preparation.dsa.problemsolving.techniques.threepointer;

/**
 * Leet Code: 88. Merge Sorted Array
 *
 * Example 1:
 *  Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 *  Output: [1,2,2,3,5,6]
 *  Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 *  The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 *
 */
public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1;
        int p2 = n-1;

        for(int p = m+n-1;p>=0 ;p--){
            if(p2 < 0){
                break;
            }
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1--];
            }else{
                nums1[p] = nums2[p2--];
            }
        }

        for(int val: nums1){
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        for(int val: nums1){
            System.out.print(val + " ");
        }
        System.out.println();
        for(int val: nums2){
            System.out.print(val + " ");
        }
        System.out.println();
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        mergeSortedArrays.merge(nums1, 3, nums2, 3);
    }
}

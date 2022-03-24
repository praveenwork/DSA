package com.interview.preparation.dsa.problemsolving.techniques.inline;

/**
 * LeetCode: 1089. Duplicate Zeros
 *
 *  Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 *  Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in
 *  place and do not return anything.
 *
 *  Example 1:
 *      Input: arr = [1,0,2,3,0,4,5,0]
 *      Output: [1,0,0,2,3,0,0,4]
 *      Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 *
 *  Example 2:
 *      Input: arr = [1,2,3]
 *      Output: [1,2,3]
 *      Explanation: After calling your function, the input array is modified to: [1,2,3]
 */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int n = arr.length-1;
        int exitCondition = n-possibleDups;
        for(int left=0 ; left <= exitCondition ; left++){
            if(arr[left] == 0){
                if(left == (n-possibleDups)){
                    arr[n] = 0;
                    n -= 1;
                    break;
                }
                possibleDups++;
                exitCondition = n - possibleDups;
            }
        }

        int last = n-possibleDups;

        for(int i = last;i>=0; i--){
            if(arr[i] == 0){
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i+possibleDups] =0;
            }else{
                arr[i+possibleDups] = arr[i];
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {1,0,2,3,0,4,5,0};
        for(int val: array){
            System.out.print(val + " ");
        }
        System.out.println();
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        duplicateZeros.duplicateZeros(array);
        for(int val: array){
            System.out.print(val + " ");
        }
    }
}

package com.interview.preparation.dsa.problemsolving.numbers;

public class NumberPalindrome {
    public boolean isPalindrome(int x) {
        // 0 and negative numbers ignored
        // out of range ignored
        if(x == 0) return true;
        if(x < 0 || x % 10 == 0) return false;

        int reverseNumber = reverse(x);
        if( x == reverseNumber){
            return true;
        }
        return false;
    }

    private int reverse(int x){
        int result = 0;
        while(x != 0){
            result = result*10 + (x%10);
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        NumberPalindrome numberPalindrome = new NumberPalindrome();
        int x = 0;
        System.out.println(numberPalindrome.isPalindrome(x));
    }
}

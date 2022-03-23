package com.interview.preparation.dsa.problemsolving.numbers;

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;

        while(x != 0){
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) {
                return 0;
            }
            int rem = x % 10;
            x = x /10;
            rev = rev*10 + rem;
        }
        return rev;
    }
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int number = -1534236469;
        System.out.println(reverseInteger.reverse(number));
    }

}

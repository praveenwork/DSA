package com.interview.preparation.dsa.problemsolving.string;

public class StringToInteger {

    public  int stringToInt(String s){
        if(s == null || s.length() == 0) return 0;

        int index = 0;
        int sign = 1;
        int result = 0;
        // white spaces need to be removed
        while(index < s.length() && s.charAt(index) == ' '){
            index++;
        }

        // consider sign
        if(index < s.length() && s.charAt(index)=='-'){
            sign = -1;
            index++;
        } else if(index < s.length() && s.charAt(index)=='+'){
            sign = 1;
            index++;
        }

        while(index < s.length() && Character.isDigit(s.charAt(index))){
            // Leading Zeros ignored
            int digit = s.charAt(index) - '0';

            // result with in limit
            if ((result > Integer.MAX_VALUE / 10) ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result*10 + digit;
            index++;
        }
        return sign * result;
    }
    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        String s = "42";
        System.out.println(stringToInteger.stringToInt(s));
    }
}

package com.udit.topQuestions.hard;

import java.math.BigInteger;

public class SuperPalindrome {


    public static void main(String[] args) {
        System.out.println(superpalindromesInRange("40000000000000000", "50000000000000000"));
    }
    public static int superpalindromesInRange(String left, String right) {
        //a number which is palindrome and it's sqrt is also palindrome is super palindrome
        long l = new Long(left);
        long r = new Long(right);
        int cnt = 0;




        for(long i=l; i<=r; i++) {
            if(Math.sqrt(i) % 1 == 0) {
                if (isPalindrome(String.valueOf((int)Math.sqrt(i))) && isPalindrome(String.valueOf(i))) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static boolean isPalindrome(String s) {
        int start =0;
        int end = s.length()-1;
        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

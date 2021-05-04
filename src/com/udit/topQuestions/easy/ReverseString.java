package com.udit.topQuestions.easy;
/*
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int index = 0;
        for(int i=s.length-1; i>=s.length/2; i--) {
            char temp = s[i];
            s[i] = s[index];
            s[index] = temp;
            index++;
        }
    }
}

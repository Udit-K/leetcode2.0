package com.udit.topQuestions.medium;

import java.util.ArrayList;
import java.util.List;

/*
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "au";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        //base case
        if(s == null || s.equals("")) return max;
        if(s.equals(" ")) return 1;
        if(s.length() == 1) return 1;
        int start = 0;
        int end = 1;
        List<String> uniqueList = new ArrayList<>();
        uniqueList.add(String.valueOf(s.charAt(start)));
        while(start<end && end<s.length()) {
            String curr = String.valueOf(s.charAt(end));
            if(!uniqueList.contains(curr)) {
                uniqueList.add(curr);
            }else {
                max = max > uniqueList.size() ? max: uniqueList.size();
                start = uniqueList.indexOf(curr) + 1;
                int len = uniqueList.indexOf(curr)+1;
                for(int i = 0;i<len;i++) {
                    uniqueList.remove(0);
                }
                uniqueList.add(curr);
            }
            end++;
        }
        return max > uniqueList.size()? max: uniqueList.size();
    }
}

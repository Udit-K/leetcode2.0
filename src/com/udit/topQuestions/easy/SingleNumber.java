package com.udit.topQuestions.easy;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for(int i=0; i< nums.length;i++) {
            ans = ans^nums[i];
        }
        return ans;
    }
}

package com.udit.topQuestions.easy;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];

        Arrays.sort(nums);
        int start = 0;

        while(start<nums.length-1) {
            if(nums[start] == nums[start+1]) {
                start +=2;
            }else {
                return nums[start];
            }
        }
        return nums[nums.length-1];
    }
}

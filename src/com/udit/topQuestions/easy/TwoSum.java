package com.udit.topQuestions.easy;

import java.util.HashMap;
import java.util.Map;

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        twoSum(nums, 9);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> targetMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(!targetMap.containsKey(nums[i])) {
                targetMap.put(target-nums[i], i);
            }else {
                return new int[]{targetMap.get(nums[i]), i};
            }
        }
        return null;
    }
}

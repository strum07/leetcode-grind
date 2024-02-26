package com.sagar.grind75.week1;

//https://leetcode.com/problems/two-sum/description/

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == diff) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}

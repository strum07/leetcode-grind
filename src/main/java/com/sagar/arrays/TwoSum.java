package com.sagar.arrays;

import java.util.HashSet;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // go through the array and return the indices of the two numbers that add up to the target
        // if no such numbers exist, return an empty array
        // if there are multiple pairs, return any one of them
        // the array is not sorted
        // the array can have negative numbers
        // the array can have duplicates
        // the array can have zeros
        // the array can have positive numbers
        // the array can have positive and negative numbers

        // implementation
        // go through the array and for each number, check if the difference between the target and the number is present in the array
        // if it is present, return the indices of the two numbers
        // if it is not present, continue

        // edge cases
        // if the array is empty, return an empty array
        // if the array has only one element, return an empty array

        // time complexity: O(n^2)
        // space complexity: O(1)

        // optimization
        // use a hashset to store the numbers as we go through the array
        // for each number, check if the difference between the target and the number is present in the hashset
        // if it is present, return the indices of the two numbers

        return twoSumOptimized(nums, target);

    }


    private static int[] twoSumOptimized(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (set.contains(difference)) {
                return new int[]{i, nums[i]};
            }
            set.add(nums[i]);
        }
        return new int[]{};
    }

}

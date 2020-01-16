package com.github.liuyx11241.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum <br>
 * https://leetcode.com/problems/two-sum/
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        System.out.println(Arrays.toString(solution1.twoSum(new int[] { 3, 3 }, 6)));
    }
}
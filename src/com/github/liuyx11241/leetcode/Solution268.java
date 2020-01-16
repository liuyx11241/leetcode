package com.github.liuyx11241.leetcode;

/**
 * 268. Missing Number https://leetcode.com/problems/missing-number/
 */
public class Solution268 {
    public int missingNumber(int[] nums) {
        int[] count = new int[nums.length + 1];
        for (int num : nums) {
            if (num < count.length) {
                ++count[num];
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Solution268 solution268 = new Solution268();

        System.out.println(solution268.missingNumber(new int[] { 1 }));
    }
}
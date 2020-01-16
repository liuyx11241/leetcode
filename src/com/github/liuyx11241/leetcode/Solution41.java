package com.github.liuyx11241.leetcode;

/**
 * 41. First Missing Positive
 * https://leetcode.com/problems/first-missing-positive/
 */

public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        if (nums.length == 1) {
            return nums[0] == 1 ? 2 : 1;
        }

        int i = 0;
        int j = 0;
        int tmp = 0;
        int max = 0;
        for (int k = 0; k < nums.length; k++) {
            max = Math.max(nums[k], max);

        }
        while (i < nums.length) {
            j = nums[i];
            if (i != j) {
                while (j < nums.length && j >= 0 && j != nums[j]) {
                    tmp = nums[j];
                    nums[j] = j;
                    j = tmp;
                }
            }
            ++i;
        }

        for (int k = 1; k < nums.length; k++) {
            if (k != nums[k]) {
                return k;
            }
        }
        return max == nums.length ? nums.length + 1 : nums.length;

    }

    public static void main(String[] args) {
        Solution41 solution41 = new Solution41();

        System.out.println(solution41.firstMissingPositive(new int[] { 0, 1, 2 }));
        System.out.println(solution41.firstMissingPositive(new int[] { 3, -1, 4, 1 }));
        System.out.println(solution41.firstMissingPositive(new int[] { 7, 8, 9, 10, 11 }));
        System.out.println(solution41.firstMissingPositive(new int[] { -1, 4, 6, 2, 1, 9, 3 }));
        System.out.println(solution41.firstMissingPositive(new int[] { 1, 1 }));
        System.out.println(solution41.firstMissingPositive(new int[] { 1, 2 }));
    }
}
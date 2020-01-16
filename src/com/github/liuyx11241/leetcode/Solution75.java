package com.github.liuyx11241.leetcode;

import java.util.Arrays;

/**
 * 75. Sort Colors
 * https://leetcode.com/problems/sort-colors/
 */
public class Solution75 {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int index0 = 0;
        int index2 = nums.length - 1;

        for (int i = 0; i <= index2; i++) {
            switch (nums[i]) {
                case 0:
                    swap(nums, i, index0);
                    if (nums[i] != nums[index0]) {
                        i--;
                    }
                    index0++;
                    break;
                case 1:
                    break;
                case 2:
                    swap(nums, i, index2);
                    index2--;
                    i--;
                    break;
                default:
                    break;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        Solution75 solution75 = new Solution75();

        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        solution75.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

package com.github.liuyx11241.leetcode;

/**
 * Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int length = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[length - 1] < nums[i]) {
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5};
        final int length = new Solution26().removeDuplicates(nums);
        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }
}

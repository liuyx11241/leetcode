package com.github.liuyx11241.leetcode;

/**
 * 162. Find Peak Element
 * https://leetcode.com/problems/find-peak-element/
 */
public class Solution162 {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        if (nums.length == 1) {
            return 0;
        }
        int start = 0;
        int end = nums.length;
        int middle;
        while (true) {
            if (nums[start] > nums[start + 1]) {
                return start;
            }
            if (nums[end - 1] > nums[end - 2]) {
                return end - 1;
            }

            middle = (end - start) / 2 + start;
            if (nums[middle] > nums[middle + 1]) {
                end = middle + 1;
            } else {
                start = middle + 1;

            }
        }
    }

    public static void main(String[] args) {
        Solution162 solution = new Solution162();

        System.out.println(solution.findPeakElement(new int[] { 1, 2, 3, 1 }));
        System.out.println(solution.findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
        System.out.println(solution.findPeakElement(new int[] { 1, 2, 3, 4, 5, 6, 1 }));

    }
}
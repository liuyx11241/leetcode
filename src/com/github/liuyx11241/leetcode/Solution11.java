package com.github.liuyx11241.leetcode;

/**
 * 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/
 */
public class Solution11 {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;

        }
        int i = 0;
        int j = height.length;
        int maxArea = 0;
        while (i < j) {
            maxArea = Math.max(maxArea, (j - i - 1) * Math.min(height[i], height[j - 1]));
            if (height[i] < height[j - 1]) {
                ++i;
            } else {
                --j;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();

        System.out.println(solution11.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }
}
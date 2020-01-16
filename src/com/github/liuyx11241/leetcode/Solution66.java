package com.github.liuyx11241.leetcode;

import java.util.Arrays;

/**
 * 66. Plus One<br>
 * https://leetcode.com/problems/plus-one/
 */
public class Solution66 {
    public int[] plusOne(int[] digits) {
        int i = digits.length;
        while (i > 0) {
            if (digits[i - 1] == 9) {
                digits[i - 1] = 0;
            } else {
                break;
            }
            i--;
        }
        if (i > 0) {
            ++digits[i - 1];
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        Solution66 solution66 = new Solution66();
        System.out.println(Arrays.toString(solution66.plusOne(new int[] { 9, 9, 9 })));
        System.out.println(Arrays.toString(solution66.plusOne(new int[] { 9, 9, 8 })));
    }
}
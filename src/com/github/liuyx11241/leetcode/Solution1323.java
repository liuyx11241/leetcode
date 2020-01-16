package com.github.liuyx11241.leetcode;

/**
 * 1323. Maximum 69 Number <br>
 * https://leetcode.com/problems/maximum-69-number/
 */

public class Solution1323 {
    public int maximum69Number(int num) {
        int pow = 1000;

        while (pow > 0) {
            if (num / pow % 10 == 6) {
                num += 3 * pow;
                break;
            }
            pow = pow / 10;
        }

        return num;
    }

    public static void main(String[] args) {
        Solution1323 solution1323 = new Solution1323();
        System.out.println(solution1323.maximum69Number(6669));
        System.out.println(solution1323.maximum69Number(9999));
        System.out.println(solution1323.maximum69Number(9696));
    }
}
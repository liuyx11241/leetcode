package com.github.liuyx11241.leetcode;

/**
 * 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/
 */
public class Solution7 {
    public int reverse(int x) {

        int runner = x;
        int result = 0;

        StringBuilder sbResult = new StringBuilder();

        while (runner != 0) {
            result = result * 10 + (runner % 10);
            sbResult.append(Math.abs(runner % 10));
            runner = runner / 10;
        }

        String limit = x > 0 ? String.valueOf(0x7FFFFFFF) : String.valueOf(0x80000000L);

        if (sbResult.length() >= limit.length() && sbResult.toString().compareTo(limit) > 0) {
            return 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.reverse(4));
        System.out.println(solution7.reverse(-12345));
        System.out.println(solution7.reverse(120));
        System.out.println(solution7.reverse(-123));
        System.out.println(solution7.reverse(2147483647));
        System.out.println(solution7.reverse(-1563847412));
        System.out.println(solution7.reverse(-2147483648));
    }
}
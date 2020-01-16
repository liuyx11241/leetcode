package com.github.liuyx11241.leetcode;

/**
 * 8. String to Integer (atoi)
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
public class Solution8 {
    public int myAtoi(String str) {
        char[] charArray = str.toCharArray();

        StringBuilder result = new StringBuilder();

        boolean onlyNum = false;
        int signed = 1;
        int i = 0;

        while (i < charArray.length) {
            char c = charArray[i];
            if (c == ' ' && !onlyNum) {
                ++i;
                continue;
            }
            if (c == '+' && !onlyNum) {
                onlyNum = true;
                signed = 1;
            } else if (c == '-' && !onlyNum) {
                onlyNum = true;
                signed = -1;
            } else if (c <= '9' && c >= '0') {
                onlyNum = true;
                if (c > '0' || result.length() > 0) {
                    result.append(c);

                }
            } else {
                break;
            }
            ++i;
        }

        if (result.length() > 0) {
            if (signed >= 0) {
                String max = String.valueOf(Integer.MAX_VALUE);
                if (result.length() > max.length()) {
                    return Integer.MAX_VALUE;
                } else if (result.length() == max.length() && result.toString().compareTo(max) >= 0) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.valueOf(result.toString());
                }
            } else {
                String min = String.valueOf(Integer.MIN_VALUE).substring(1);
                if (result.length() > min.length()) {
                    return Integer.MIN_VALUE;
                } else if (result.length() == min.length() && result.toString().compareTo(min) >= 0) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.valueOf("-" + result.toString());
                }
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();

        System.out.println(solution8.myAtoi(" -42"));
        System.out.println(solution8.myAtoi("4193 with words"));
        System.out.println(solution8.myAtoi("-91283472332"));
        System.out.println(solution8.myAtoi(" 0000000000012345678"));
        System.out.println(solution8.myAtoi("+-2"));
        System.out.println(solution8.myAtoi(" +0 123"));
        System.out.println(solution8.myAtoi("-0000001"));
    }
}
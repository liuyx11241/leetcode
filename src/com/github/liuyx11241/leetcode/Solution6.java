package com.github.liuyx11241.leetcode;

/**
 * 6. ZigZag Conversion
 * https://leetcode.com/problems/zigzag-conversion/submissions/
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        final int length = s.length();
        final int cycle = 2 * (numRows - 1);
        char[] newString = new char[length];
        char[] oldString = s.toCharArray();

        int row = 0;
        int col = 0;
        int i = 0;
        int j = 0;

        while (i < length) {
            if (col * cycle + row >= length) {
                col = 0;
                ++row;
            }
            // without inter column
            j = col * cycle + row;
            newString[i] = oldString[j];
            if (row > 0 && row < numRows - 1) {
                j = col * cycle + cycle - row;
                if (j < length) {
                    ++i;
                    newString[i] = oldString[j];
                }
            }
            ++col;
            ++i;
        }
        return new String(newString);
    }

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.convert("PAYPALISHIRING", 4));
    }
}
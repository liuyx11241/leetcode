package com.github.liuyx11241.leetcode;

/**
 * 166. Fraction to Recurring Decimal
 * https://leetcode.com/problems/fraction-to-recurring-decimal/
 */
public class Solution166 {
    public String fractionToDecimal(int numerator, int denominator) {

        int mod;
        int divided;
        if ((mod = numerator % denominator) == 0) {
            return String.valueOf(numerator / denominator);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(numerator / denominator).append(".");

        numerator = mod * 10;

        while ((mod = numerator % denominator) > 0 && sb.length()<128) {
            divided = numerator / denominator;
            sb.append(divided);

            numerator = mod * 10;
        }

        if (sb.indexOf(")") < 0)
            sb.append(numerator / denominator);

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution166 solution = new Solution166();

        System.out.println(solution.fractionToDecimal(1, 2));
        System.out.println(solution.fractionToDecimal(3, 2));
        System.out.println(solution.fractionToDecimal(4, 2));
        System.out.println(solution.fractionToDecimal(10, 7));
        System.out.println(solution.fractionToDecimal(66, 6700));
        System.out.println(66/6700d);
    }
}
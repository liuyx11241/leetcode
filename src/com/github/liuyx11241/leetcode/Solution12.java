package com.github.liuyx11241.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution12 {
    public String intToRoman(int num) {
        String[][] romans = new String[4][];
        romans[0] = new String[] { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        romans[1] = new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        romans[2] = new String[] { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        romans[3] = new String[] { "", "M", "MM", "MMM", "", "", "", "", "", "" };
        Deque<String> deque = new LinkedList<>();

        int pow = 0;
        int mod = 0;
        while (num > 0) {
            mod = num % 10;

            deque.push(romans[pow][mod]);

            ++pow;
            num = num / 10;
        }

        StringBuilder builder = new StringBuilder();
        while (!deque.isEmpty()) {
            builder.append(deque.pop());
        }

        return builder.toString();

    }

    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();

        System.out.println(solution12.intToRoman(3));
        System.out.println(solution12.intToRoman(4));
        System.out.println(solution12.intToRoman(9));
        System.out.println(solution12.intToRoman(58));
        System.out.println(solution12.intToRoman(1994));//MCMXCIV
    }

}
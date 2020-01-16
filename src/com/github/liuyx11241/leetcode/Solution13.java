package com.github.liuyx11241.leetcode;

/**
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/
 */
public class Solution13 {

    public int romanToInt(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        int result = 0;
        int lastValue = 10000;
        int currentValue = 0;

        for (char symbol: s.toCharArray()) {
            switch(symbol){
                case 'I': currentValue = 1;break;
                case 'V': currentValue = 5;break;
                case 'X': currentValue = 10;break;
                case 'L': currentValue = 50;break;
                case 'C': currentValue = 100;break;
                case 'D': currentValue = 500;break;
                case 'M': currentValue = 1000;break;
                default : currentValue = 0;
            }

            if (lastValue < currentValue) {
                result = result - lastValue - lastValue;
            }
            lastValue = currentValue;
            result += currentValue;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        System.out.println(solution13.romanToInt("III"));
        System.out.println(solution13.romanToInt("MCMXCIV"));
    }
}
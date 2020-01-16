package com.github.liuyx11241.leetcode;

/**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int origine = x;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == origine;
    }

    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.isPalindrome(0));
        System.out.println(solution9.isPalindrome(1));
        System.out.println(solution9.isPalindrome(121));
        System.out.println(solution9.isPalindrome(-121));
    }
}
package com.github.liuyx11241.leetcode;

/**
 * 409. Longest Palindrome<br>
 * https://leetcode.com/problems/longest-palindrome/
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        int[] letters = new int[128];

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            ++letters[c];
        }
        int length = 0;
        for (int count : letters) {
            length += 2 * (count / 2);
            if (count % 2 == 1 && length % 2 == 0) {
                length++;
            }
        }
        return length;

    }

    public static void main(String[] args) {
        Solution409 solution409 = new Solution409();
        System.out.println(solution409.longestPalindrome("abccccdd"));
        System.out.println(solution409.longestPalindrome("bb"));
    }
}
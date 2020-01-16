package com.github.liuyx11241.leetcode;

/**
 * 3. Longest Substring Without Repeating Characters <br>
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution3.lengthOfLongestSubstring("abc"));
        System.out.println(solution3.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution3.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution3.lengthOfLongestSubstring("pweitnsthsitnhgienthytqk"));
        System.out.println(solution3.lengthOfLongestSubstring(" "));
    }
}
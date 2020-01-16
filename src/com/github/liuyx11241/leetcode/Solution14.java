package com.github.liuyx11241.leetcode;

/**
 * 14. Longest Common Prefix <br>
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        } else {
            int mid = (l + r) / 2;
            String lcpLeft = longestCommonPrefix(strs, l, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i))
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }

    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        System.out.println(solution14.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
        System.out.println(solution14.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
        System.out.println(solution14.longestCommonPrefix(new String[] { "" }));
    }
}
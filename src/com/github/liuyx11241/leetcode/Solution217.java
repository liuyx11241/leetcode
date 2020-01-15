package com.github.liuyx11241.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        if (null == nums || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}

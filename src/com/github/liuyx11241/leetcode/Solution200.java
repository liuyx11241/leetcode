package com.github.liuyx11241.leetcode;

import java.util.Arrays;

/**
 * 200. Number of Islands
 * https://leetcode.com/problems/number-of-islands/
 */
public class Solution200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    makeColor(grid, i, j, (char) ('1' + count));
                }
            }
        }

        return count;
    }

    private void makeColor(char[][] grid, int i, int j, char color) {
        if (i - 1 >= 0 && grid[i - 1][j] == '1') {
            grid[i - 1][j] = color;
            makeColor(grid, i - 1, j, color);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == '1') {
            grid[i][j - 1] = color;
            makeColor(grid, i, j - 1, color);

        }
        if (i + 1 < grid.length && grid[i + 1][j] == '1') {
            grid[i + 1][j] = color;
            makeColor(grid, i + 1, j, color);
        }
        if (j + 1 < grid[i].length && grid[i][j + 1] == '1') {
            grid[i][j + 1] = color;
            makeColor(grid, i, j + 1, color);
        }
    }

    public static void main(String[] args) {
        Solution200 solution = new Solution200();
        char[][] grid = new char[3][];
        for (int i = 0; i < grid.length; i++) {
            grid[i] = new char[] { '1', '1', '1' };
        }
        grid[1][0] = '0';
        grid[1][2] = '0';
        System.out.println(Arrays.deepToString(grid));

        System.out.println(solution.numIslands(grid));
    }
}
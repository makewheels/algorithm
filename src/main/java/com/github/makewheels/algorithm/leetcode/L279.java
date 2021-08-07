package com.github.makewheels.algorithm.leetcode;

public class L279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(Integer.MAX_VALUE, dp[i - j * j]);
            }
        }
        return dp[n];
    }
}

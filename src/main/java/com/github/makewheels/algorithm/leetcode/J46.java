package com.github.makewheels.algorithm.leetcode;

public class J46 {
    public int translateNum(int num) {
        char[] chars = (num + "").toCharArray();
        int[] dp = new int[chars.length + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < chars.length; i++) {
            dp[i + 1] = dp[i];
            int currentNumber = Integer.parseInt(chars[i - 1] + String.valueOf(chars[i]));
            System.out.println(currentNumber);
            if (currentNumber >= 10 && currentNumber <= 25) {
                dp[i + 1] = dp[i] + dp[i - 1];
            }
        }
        return dp[chars.length];
    }
}

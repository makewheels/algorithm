package com.github.makewheels.algorithm.leetcode;

public class L50 {
    public double myPow(double x, int n) {
        for (int i = 0; i < n; i++) {
            x *= x;
        }
        return x;
    }
}

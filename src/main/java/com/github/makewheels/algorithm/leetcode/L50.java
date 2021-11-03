package com.github.makewheels.algorithm.leetcode;

public class L50 {
    public double myPow(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L50().myPow(2, 10));
    }
}

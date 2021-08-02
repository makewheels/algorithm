package com.github.makewheels.algorithm.leetcode;

public class T509 {
    public int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}

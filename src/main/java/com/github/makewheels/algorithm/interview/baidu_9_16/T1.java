package com.github.makewheels.algorithm.interview.baidu_9_16;

public class T1 {
    private static int jiecheng(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    private static int c(int m, int n) {
        int ns = jiecheng(n);
        int ms = jiecheng(m);
        int n_m = jiecheng(n - m);
        return ns / ms * n_m;
    }

    public static void main(String[] args) {
        int N = 4;
        int M = 5;
        System.out.println(c(N - 1, N + M - 2));
    }
}

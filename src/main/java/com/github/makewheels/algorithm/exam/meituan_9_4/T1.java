package com.github.makewheels.algorithm.exam.meituan_9_4;

import java.util.Scanner;

public class T1 {

    private static int getMod(int x, int y) {
        return (x + y) % 998244353;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println(2);
        } else {
            judge(n);
        }
    }

    private static void judge(int n) {
        int[][][] dp = new int[n][2][2];
        for (int o1 = 0; o1 < 2; o1++) {
            for (int o2 = 0; o2 < 2; o2++) {
                dp[1][o1][o2] = 1;
            }
        }
        int sum = 0;
        for (int i = 2; i < n; i++) {
            for (int o1 = 0; o1 < 2; o1++) {
                for (int o2 = 0; o2 < 2; o2++) {
                    if (o1 == o2) {
                        dp[i][o1][o2] = getMod(dp[i][o1][o2], dp[i - 1][0][o1]);
                        dp[i][o1][o2] = getMod(dp[i][o1][o2], dp[i - 1][1][o1]);
                    } else {
                        dp[i][o1][o2] = getMod(dp[i][o1][o2], dp[i - 1][o2 ^ 1][o1]);
                    }
                    if (i == n - 1) {
                        sum = getMod(sum, dp[i][o1][o2]);
                    }
                }
            }

        }
        System.out.println(sum);
    }
}

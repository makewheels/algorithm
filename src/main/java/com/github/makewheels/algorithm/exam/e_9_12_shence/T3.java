package com.github.makewheels.algorithm.exam.e_9_12_shence;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] a = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j >= 0; j--) {
                System.out.println(a[j][i]);
            }
        }
    }
}

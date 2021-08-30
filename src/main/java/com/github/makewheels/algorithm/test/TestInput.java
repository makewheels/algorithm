package com.github.makewheels.algorithm.test;

import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[2];
            for (int j = 0; j < 2; j++) {
                arr[j] = scanner.nextInt();
            }
            System.out.println(arr[0] + arr[1]);
        }

    }
}

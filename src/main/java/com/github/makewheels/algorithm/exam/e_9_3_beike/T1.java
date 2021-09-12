package com.github.makewheels.algorithm.exam.e_9_3_beike;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.println(n / 2);
            } else {
                System.out.println(n / 2 + 1);
            }
        }
    }
}

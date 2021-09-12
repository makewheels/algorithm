package com.github.makewheels.algorithm.exam.shence_9_12;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        if (x + y == m) {
            System.out.println(0);
        } else if (x + y < 0) {
            System.out.println(-1);
        }
        int count = 0;
        do {
            count++;
            int sum = x + y;
            if (x < y) {
                x = sum;
            } else {
                y = sum;
            }
        } while (x < m && y < m);
        System.out.println(count);
    }
}

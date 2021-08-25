package com.github.makewheels.algorithm.exam.jibite_8_24;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x = sc.nextInt();
                ans += x;
            }
        }
        System.out.println(ans);
    }
}

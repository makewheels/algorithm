package com.github.makewheels.algorithm.exam.e_9_18_netease;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = n + "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int number = Integer.parseInt(str.charAt(i) + "");
            if (number == 0) {
                continue;
            }
            if (n % number == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

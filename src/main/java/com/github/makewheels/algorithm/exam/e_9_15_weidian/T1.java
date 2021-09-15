package com.github.makewheels.algorithm.exam.e_9_15_weidian;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        int p1 = 0;
        for (int i = 0; i < line2.length(); i++) {
            char c = line2.charAt(i);
            while (p1 < line1.length()) {
                if (line1.charAt(p1) == c) {
                    break;
                }
                p1++;
            }
            if (p1 == line1.length()) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}

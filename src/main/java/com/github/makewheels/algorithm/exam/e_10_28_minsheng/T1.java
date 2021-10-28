package com.github.makewheels.algorithm.exam.e_10_28_minsheng;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int amount = scanner.nextInt();
            scanner.nextLine();
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            char[] chars1 = line1.toCharArray();
            char[] chars2 = line2.toCharArray();
            int correct = 0;
            for (int j = 0; j < chars1.length; j++) {
                if (chars1[j] == chars2[j]) {
                    correct++;
                }
            }
            int wrong = amount - correct;
            if (correct == wrong) {
                System.out.println("(O.O)");
            } else if (correct > wrong) {
                System.out.println("oh no");
            } else {
                System.out.println("oh yes");
            }
        }
    }
}

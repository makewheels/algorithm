package com.github.makewheels.algorithm.exam.hulu_8_26;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.split(" ");
        long[] arr = new long[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Long.parseLong(split[i]);
        }
        long count = 0;
        for (long i = arr[1]; i <= arr[2]; i++) {
            String str = i + "";
            long sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += Long.parseLong(str.charAt(j) + "");
            }
            if (sum % arr[0] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

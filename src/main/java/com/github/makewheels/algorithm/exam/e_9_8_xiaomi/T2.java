package com.github.makewheels.algorithm.exam.e_9_8_xiaomi;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j);
        }
    }
}

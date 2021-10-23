package com.github.makewheels.algorithm.exam.e_10_23_xiaohongshu_android;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replace("[", "");
        line = line.replace("]", "");
        String[] split = line.split(",");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        for (int i = 0; i < split.length; i++) {
            if (arr[i] != 5 && arr[i] != 10 && arr[i] != 20) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}

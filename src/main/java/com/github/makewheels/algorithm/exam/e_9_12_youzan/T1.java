package com.github.makewheels.algorithm.exam.e_9_12_youzan;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replace(" ", "");
        line = line.replace("[", "");
        line = line.replace("]", "");
        String[] split = line.split(",");
        int[] height = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            height[i] = Integer.parseInt(split[i]);
        }
        int p1 = 0;
        int p2 = height.length - 1;
        int max = 0;
        while (p1 <= p2) {
            int area = Math.min(height[p2], height[p1]) *(p2 - p1);
            if (area > max) {
                max = area;
            }
            if (height[p1] < height[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        System.out.println(max);
    }
}

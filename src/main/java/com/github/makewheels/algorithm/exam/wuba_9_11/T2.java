package com.github.makewheels.algorithm.exam.wuba_9_11;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replace(" ", "");
        line = line.replace("[", "");
        line = line.replace("]", "");
        String[] split = line.split(",");
        int[] input = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            input[i] = Integer.parseInt(split[i]);
        }
        int size = input[input.length - 1];
        int[] arr = new int[input.length - 1];
        System.arraycopy(input, 0, arr, 0, arr.length);
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < arr.length - size; i++) {
            int value = 0;
            for (int j = 0; j < size; j++) {
                value += arr[i + j];
            }
            if (value > maxValue) {
                maxValue = value;
                maxIndex = i;
            }
        }
        System.out.println(Arrays.toString(new int[]{maxIndex, maxValue}).replace(" ", ""));
    }
}

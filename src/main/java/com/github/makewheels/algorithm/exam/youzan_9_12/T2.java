package com.github.makewheels.algorithm.exam.youzan_9_12;

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
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        int maxValue = arr[0];
        int maxIndex = 0;
        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            if (cur > maxValue) {
                maxIndex = i;
                maxValue = cur;
            } else if (cur < minValue) {
                minIndex = i;
                minValue = cur;
            }
        }
        int temp;
        temp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = temp;
        if (maxIndex == 0) {
            maxIndex = minIndex;
        }

        temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[maxIndex];
        arr[maxIndex] = temp;

        System.out.println(Arrays.toString(arr).replace(" ", ""));
    }
}

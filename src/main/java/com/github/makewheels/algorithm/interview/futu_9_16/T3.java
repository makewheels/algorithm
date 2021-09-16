package com.github.makewheels.algorithm.interview.futu_9_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T3 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 1, 6, 8, 7};
        int[] max = new int[arr.length];
        int[] min = new int[arr.length];

        int minValue = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < minValue) {
                min[i] = arr[i];
                minValue = arr[i];
            } else {
                min[i] = minValue;
            }
        }

        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                max[i] = arr[i];
                maxValue = arr[i];
            } else {
                max[i] = maxValue;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min[i] && arr[i] >= max[i]) {
                result.add(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(min));
        System.out.println(Arrays.toString(max));
        System.out.println(result);
    }
}

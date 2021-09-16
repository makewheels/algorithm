package com.github.makewheels.algorithm.interview.futu_9_16;

import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        int left = 0;
        int right = 0;
        while (right < array.length) {
            if (array[right] != 0) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(array));
    }
}

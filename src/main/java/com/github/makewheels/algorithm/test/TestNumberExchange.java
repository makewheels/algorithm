package com.github.makewheels.algorithm.test;

import java.util.Arrays;

public class TestNumberExchange {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 6, 8, 1};
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 1 && left < right) {
                left++;
            }
            while (arr[right] % 2 == 0 && left < right) {
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

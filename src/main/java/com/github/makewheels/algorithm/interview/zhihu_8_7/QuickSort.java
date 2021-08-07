package com.github.makewheels.algorithm.interview.zhihu_8_7;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-74, 48, -20, 2, 10, -84, -5, -9, 11, -24, -91, 2, -71, 64, 63, 80, 28, -30, -58, -11, -44, -87, -22, 54, -74, -10, -55, -28, -46, 29, 10, 50, -72, 34, 26, 25, 8, 51, 13, 30, 35, -8, 50, 65, -6, 16, -2, 21, -78, 35, -13, 14, 23, -3, 26, -90, 86, 25, -56, 91, -13, 92, -25, 37, 57, -20, -69, 98, 95, 45, 47, 29, 86, -28, 73, -44, -46, 65, -84, -96, -24, -12, 72, -68, 93, 57, 92, 52, -45, -2, 85, -63, 56, 55, 12, -85, 77, -39};
        System.out.println(Arrays.toString(
                new QuickSort().quickSort(arr, 0, arr.length - 1)));
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return arr;
        }
        int p = partition(arr, left, arr.length - 1);
        quickSort(arr, left, p - 1);
        quickSort(arr, p + 1, right);
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];

        }
        arr[left] = pivot;
        return left;
    }

}

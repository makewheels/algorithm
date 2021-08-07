package com.github.makewheels.algorithm.leetcode;

public class L912 {
    public int[] sortArray(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
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

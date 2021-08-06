package com.github.makewheels.algorithm.leetcode;

public class L912 {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] arr, int left, int right) {
        int p = partition(arr, left, right);
        if (left < right)
            quickSort(arr, p + 1, right);
        if (left < right)
            quickSort(arr, 0, p - 1);
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        return 0;
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

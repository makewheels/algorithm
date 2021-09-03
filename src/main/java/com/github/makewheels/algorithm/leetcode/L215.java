package com.github.makewheels.algorithm.leetcode;

public class L215 {
    public int findKthLargest(int[] nums, int k) {
        int index = quickSort(nums, 0, nums.length - 1, nums.length - k);
        return nums[index];
    }

    private int quickSort(int[] arr, int left, int right, int k) {
        int pivotIndex = partition(arr, left, right);
        if (pivotIndex == k) {
            return pivotIndex;
        } else {
            if (pivotIndex < k) {
                return quickSort(arr, pivotIndex + 1, right, k);
            } else {
                return quickSort(arr, left, pivotIndex - 1, k);
            }
        }
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

package com.github.makewheels.algorithm.basic.sort;

public class QuickSort {
    public int[] sortArray(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
    }

    private int[] quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return nums;
        }
        int p = partition(nums, left, right);
        quickSort(nums, left, p - 1);
        quickSort(nums, p + 1, right);
        return nums;
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (left < right && nums[right] >= pivot) right--;
            nums[left] = nums[right];
            while (left < right && nums[left] <= pivot) left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
}

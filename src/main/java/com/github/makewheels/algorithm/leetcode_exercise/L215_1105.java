package com.github.makewheels.algorithm.leetcode_exercise;

public class L215_1105 {
    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSort(int[] nums, int left, int right, int k) {
        int p = partition(nums, left, right);
        if (p == k) {
            return nums[p];
        } else if (p < k) {
            return quickSort(nums, p + 1, right, k);
        } else {
            return quickSort(nums, left, p - 1, k);
        }
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

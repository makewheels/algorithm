package com.github.makewheels.algorithm.exercise;

public class e_1109_QuickSort {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {
        int p = partiion(nums, left, right);

    }

    private void partiion(int[] nums, int left, int right) {

    }
}

package com.github.makewheels.algorithm.exercise;

import com.github.makewheels.algorithm.basic.sort.SortUtil;

import java.util.Arrays;

public class e_11_5_QuickSort {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int index = partition(nums, left, right);
        quickSort(nums, left, index - 1);
        quickSort(nums, index + 1, right);
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (nums[right] >= pivot && left < right) right--;
            System.out.println(Arrays.toString(nums)
                    + "  nums[" + left + "]=" + nums[left] + " nums[" + right + "]=" + nums[right]);
            nums[left] = nums[right];
            while (nums[left] <= pivot && left < right) left++;
            System.out.println(Arrays.toString(nums)
                    + "  nums[" + left + "]=" + nums[left] + " nums[" + right + "]=" + nums[right]);
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new e_11_5_QuickSort().sortArray(SortUtil.getArray())));
    }
}

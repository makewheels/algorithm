package com.github.makewheels.algorithm.exercise;

public class e_11_5_BubbleSort {

    public int[] sortArray(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            boolean isSorted = true;
            for (int j = 0; j <= i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
        return nums;
    }
}

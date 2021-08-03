package com.github.makewheels.algorithm.leetcode;

public class L189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0 || k == nums.length)
            return;
        int[] arr = new int[nums.length];
        System.arraycopy(nums, 0, arr, k, nums.length - k);
        System.arraycopy(nums, nums.length - k, arr, 0, k);
        System.arraycopy(arr, 0, nums, 0, nums.length);

    }
}

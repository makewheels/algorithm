package com.github.makewheels.algorithm.leetcode;

import java.util.Arrays;

public class L283 {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (nums[right] == 0) {
            if (right < nums.length) {
                right++;
            }
        }
        while (nums[left] != 0)
            left++;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        new L283().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}

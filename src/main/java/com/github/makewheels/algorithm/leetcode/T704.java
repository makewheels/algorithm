package com.github.makewheels.algorithm.leetcode;

public class T704 {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int result = new T704().search(arr, 9);
        System.out.println(result);
    }
}

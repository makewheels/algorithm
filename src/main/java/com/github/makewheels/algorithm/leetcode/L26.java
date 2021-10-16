package com.github.makewheels.algorithm.leetcode;

public class L26 {
    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        while (p2 < nums.length) {
            if (nums[p1] == nums[p2]) {
                p2++;
            } else {
                p1++;
                nums[p1] = nums[p2];
                p2++;
            }
        }
        return p1 + 1;
    }
}

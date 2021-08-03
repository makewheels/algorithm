package com.github.makewheels.algorithm.leetcode;

import java.util.Arrays;

public class L88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        new L88().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}

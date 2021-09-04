package com.github.makewheels.algorithm.leetcode;

import java.util.Arrays;

public class L4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (arr[(arr.length - 1) / 2] * 1.0 + arr[(arr.length - 1) / 2 + 1]) / 2;
        }
    }
}

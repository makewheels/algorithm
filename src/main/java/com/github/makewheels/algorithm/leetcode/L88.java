package com.github.makewheels.algorithm.leetcode;

public class L88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int p1 = 0;
        int p2 = 0;
        int pres = 0;
        while (p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                res[pres] = nums1[p1];
                p1++;
            } else {
                res[pres] = nums2[p2];
                p2++;
            }
            pres++;
        }
        if (p1 < m) {
            System.arraycopy(nums1, p1, res, pres, m - p1);
        } else {
            System.arraycopy(nums2, p2, res, pres, n - p2);
        }
        System.arraycopy(res, 0, nums1, 0, m + n);
    }

}

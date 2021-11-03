package com.github.makewheels.algorithm.test;

import com.github.makewheels.algorithm.basic.sort.SortUtil;

import java.util.Arrays;

public class TestGuibing {
    public int[] sortArray(int[] nums) {
        int[] res = new int[nums.length];
        sort(nums, 0, nums.length - 1, res);
        return res;
    }

    private void sort(int[] nums, int left, int right, int[] res) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(nums, left, mid, res);
            sort(nums, mid + 1, right, res);

            int[] arr1 = new int[mid - left];
            int[] arr2 = new int[right - mid - 1];
            System.arraycopy(nums, left, arr1, 0, mid);
            System.arraycopy(nums, mid, arr2, 0, right - mid - 1);

            System.out.println("arr1=" + Arrays.toString(arr1));
            System.out.println("arr2=" + Arrays.toString(arr2));
            int[] mergeResult = merge(arr1, arr2);

            System.arraycopy(mergeResult, 0, res, left, mergeResult.length);
        }
    }

    public int[] merge(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int pres = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                res[pres] = arr1[p1];
                p1++;
            } else {
                res[pres] = arr2[p2];
                p2++;
            }
            pres++;
        }
        if (p1 < arr1.length) {
            while (p1 < arr1.length) {
                res[pres] = arr1[p1];
                p1++;
                pres++;
            }
        } else if (p2 < arr2.length) {
            while (p2 < arr2.length) {
                res[pres] = arr2[p2];
                p2++;
                pres++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new TestGuibing().sortArray(SortUtil.getArray());
    }
}

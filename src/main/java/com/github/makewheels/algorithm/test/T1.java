package com.github.makewheels.algorithm.test;

import java.util.Arrays;

public class T1 {
    private int[] merge(int[] arr1, int[] arr2) {
        int p1 = 0;
        int p2 = 0;
        int[] result = new int[arr1.length + arr2.length];
        int pr = 0;
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                result[pr] = arr1[p1];
                p1++;
            } else {
                result[pr] = arr2[p2];
                p2++;
            }
            pr++;
        }
        if (p1 < arr1.length) {
            System.arraycopy(arr1, p1, result, pr, arr1.length - p1);
        } else {
            System.arraycopy(arr2, p2, result, pr, arr2.length - p2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6};
        int[] arr2 = {2, 3, 7, 9};
        System.out.println(Arrays.toString(new T1().merge(arr1, arr2)));
    }
}

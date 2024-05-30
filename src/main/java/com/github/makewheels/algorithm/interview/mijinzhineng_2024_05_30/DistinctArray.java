package com.github.makewheels.algorithm.interview.mijinzhineng_2024_05_30;

import java.util.HashSet;
import java.util.Set;

public class DistinctArray {
    // 已知数组 A, B, 如果 A 中元素在 B 数组存在，打印出这个元素的下标，B 数组是不重复的.
    // Input: [5, 3, 1, 5, 4] [5, 3]
    // Output: [0, 1, 3]

    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 1, 5, 4};
        int[] b = new int[]{5, 3};
        Set<Integer> setB = new HashSet<>();
        for (int each : b) {
            setB.add(each);
        }
        for (int i = 0; i < a.length; i++) {
            if (setB.contains(a[i])) {
                System.out.println(i);
            }
        }
    }
}

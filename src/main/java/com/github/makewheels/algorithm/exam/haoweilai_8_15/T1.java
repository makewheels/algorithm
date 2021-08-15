package com.github.makewheels.algorithm.exam.haoweilai_8_15;

import java.util.Arrays;

public class T1 {
    public int findK(int[] array, int n, int k) {
        Arrays.sort(array);
        return array[array.length - k];
    }
}

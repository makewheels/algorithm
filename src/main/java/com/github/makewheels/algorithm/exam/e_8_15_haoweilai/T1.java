package com.github.makewheels.algorithm.exam.e_8_15_haoweilai;

import java.util.Arrays;

public class T1 {
    public int findK(int[] array, int n, int k) {
        Arrays.sort(array);
        return array[array.length - k];
    }
}

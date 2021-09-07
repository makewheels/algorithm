package com.github.makewheels.algorithm.exam.juming_9_7;

import com.github.makewheels.algorithm.basic.sort.SortUtil;

import java.util.Arrays;

public class T3 {
    public static void main(String[] args) {
        int[] array = SortUtil.getArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

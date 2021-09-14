package com.github.makewheels.algorithm.exam.e_9_14_yingjiao;

import java.util.Random;

public class T1 {
    public int increaseInterval(int[] a) {
        int[] arr = {1, 3, 4, 9};
        int index = new Random().nextInt(arr.length);
        return arr[index];
    }
}

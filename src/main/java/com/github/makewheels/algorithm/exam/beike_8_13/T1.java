package com.github.makewheels.algorithm.exam.beike_8_13;

import java.util.Arrays;

public class T1 {
    public long[] FarmerNN(int n, long m) {
        long[] result = new long[n];
        int index = 0;
        int direction = 1;
        long count = m;
        while (count > 0) {
            if (index == n - 1 || (index == 0 && count != m)) {
                direction = -direction;
            }
            result[index]++;
            index = index + direction;
            count--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new T1().FarmerNN(2, 5)));
    }
}

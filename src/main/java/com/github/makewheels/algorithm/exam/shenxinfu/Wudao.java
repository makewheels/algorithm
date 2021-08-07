package com.github.makewheels.algorithm.exam.shenxinfu;

import java.util.ArrayList;
import java.util.List;

public class Wudao {
    //    public int TeamNums(int[] height) {
    public int TeamNums() {
        int[] height = {1, 5, 3, 2, 4};
        List<Integer> increase = new ArrayList<>();
        int max = height[0];

        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                increase.add(height[i]);
                max = height[i];
            }
        }
        System.out.println(increase);
        return 0;
    }

    public static void main(String[] args) {
        new Wudao().TeamNums();
    }
}

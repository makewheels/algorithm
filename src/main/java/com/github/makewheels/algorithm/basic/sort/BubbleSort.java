package com.github.makewheels.algorithm.basic.sort;

import java.util.Arrays;

public class BubbleSort {

    public int[] sortArray(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            boolean flag = true;
            for (int j = 0; j <= i; j++) {
                System.out.print("j=" + j + " i=" + i);
                System.out.print("  j=" + j + " ");
                System.out.print("j+1=" + (j + 1));
                System.out.print("  nums=" + nums[j] + " " + nums[j + 1] + " ");
                System.out.print(Arrays.toString(nums) + " ");
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = false;
                }
                System.out.println(Arrays.toString(nums));
            }
            if (flag) {
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        System.out.println(Arrays.toString(new BubbleSort().sortArray(arr)));
    }

}

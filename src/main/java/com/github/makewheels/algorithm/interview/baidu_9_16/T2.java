package com.github.makewheels.algorithm.interview.baidu_9_16;

public class T2 {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 16, 7, 5, 11, 9};
        int leftValue = array[0];
        int maxDiff = 0;
        for (int each : array) {
            //每次记录左边的最大值
            if (each > leftValue) {
                leftValue = each;
                //仅当，差值大于之前记录的maxDiff时，才更新
            } else if (leftValue - each > maxDiff) {
                maxDiff = leftValue - each;
            }
        }
        System.out.println(maxDiff);
    }
}

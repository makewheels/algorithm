package com.github.makewheels.algorithm.exam.ali_8_27;

import java.util.Scanner;

public class T1 {
    private static int findMinIndex(long[] arr) {
        long minValue = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int findMaxIndex(long[] arr) {
        long minValue = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] s1 = line1.split(" ");
        String[] s2 = line2.split(" ");
        long[] a1 = new long[2];
        long[] a2 = new long[s2.length];
        for (int i = 0; i < s1.length; i++) {
            a1[i] = Long.parseLong(s1[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            a2[i] = Long.parseLong(s2[i]);
        }
        long k = a1[1];
        for (int i = 0; i < k; i++) {
            int minIndex = findMinIndex(a2);
            a2[minIndex]++;
        }
        int maxIndex = findMaxIndex(a2);
        System.out.println(a2[maxIndex]);

    }
}

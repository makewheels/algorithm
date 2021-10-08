package com.github.makewheels.algorithm.exam.e_9_26_duxiaoman;

import java.util.Arrays;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        int pointer = 0;
        int countAll = 0;
        int countAB = 1;
        String aOrB = "a";
        while (countAll < n - 1) {
            if (pointer == n - 1) {
                pointer = 0;
            }
            System.out.println(" pointer = " + pointer + " countAB = " + countAB + " " + aOrB
                    + " " + Arrays.toString(arr));
            if (arr[pointer]) {
                if (aOrB.equals("a") && countAB == a) {
                    arr[pointer] = false;
                    aOrB = "b";
                    countAB = 1;
                    countAll++;
                } else if (aOrB.equals("b") && countAB == b) {
                    arr[pointer] = false;
                    aOrB = "a";
                    countAB = 1;
                    countAll++;
                } else {
                    countAB++;
                }
            }
            pointer++;
        }
        if (pointer == n) {
            System.out.println(1);
        }
        System.out.println(pointer);
    }
}

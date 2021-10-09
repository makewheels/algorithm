package com.github.makewheels.algorithm.exam.e_10_09_jd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("1 1");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int each : arr) {
            map.merge(each, 1, Integer::sum);
        }
        int maxKey = 0;
        int maxValue = 0;
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if (value > maxValue) {
                maxKey = key;
                maxValue = value;
            }
        }
        int first = 0;
        int last = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxKey) {
                first = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == maxKey) {
                last = i;
                break;
            }
        }
        first++;
        last++;
        System.out.println(first + " " + last);
    }
}

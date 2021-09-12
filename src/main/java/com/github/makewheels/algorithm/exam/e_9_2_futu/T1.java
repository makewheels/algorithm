package com.github.makewheels.algorithm.exam.e_9_2_futu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class T1 {
    public static void main(String[] args) {
        int n = 1;
        int a = (int) Math.pow(n * 1.0, n * 1.0) - n + 1;
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        scanner.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
        }
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) == 1) {
                System.out.println(key);
                return;
            }
        }
    }
}

package com.github.makewheels.algorithm.exam.e_10_10_didi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
        }
        Set<Double> set = new HashSet<>();
        for (double each : arr) {
            set.add(each);
        }
        System.out.println(set.size());
    }
}

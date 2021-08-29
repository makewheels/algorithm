package com.github.makewheels.algorithm.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.sort((o1, o2) -> o2 - o1);
        Integer max = Collections.max(list);

//        4 2 1
//        1 2 3 4
        Scanner scanner = new Scanner(System.in);
        int total, p, q;
        total = scanner.nextInt();
        p = scanner.nextInt();
        q = scanner.nextInt();
        int[] arr2 = new int[total];
        for (int i = 0; i < total; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.println("total = " + total);
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println(Arrays.toString(arr2));
    }
}

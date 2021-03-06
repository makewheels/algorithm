package com.github.makewheels.algorithm.exam.e_8_22_pinduoduo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            int a1 = Integer.parseInt(split[0]);
            int a2 = Integer.parseInt(split[1]);
            int min = 1;
            for (int j = 0; j < a1 - 1; j++) {
                min = min * 10;
            }
            for (int j = min; true; j++) {
                if (j % a2 == 0) {
                    resultList.add(j);
                    break;
                }
            }
            resultList.add(Integer.MAX_VALUE);
        }
        for (Integer integer : resultList) {
            if (integer == Integer.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(integer);
        }
    }
}

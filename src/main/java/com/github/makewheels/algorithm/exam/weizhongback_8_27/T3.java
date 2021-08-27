package com.github.makewheels.algorithm.exam.weizhongback_8_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String line = scanner.nextLine();
        String[] split = line.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s : split) {
            list.add(Integer.parseInt(s));
        }
        boolean last = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < Collections.min(list)) {
                System.out.println(i + 1);
            }
            if (i == list.size() - 1 && list.get(i) < i) {
                last = true;
            }
        }
        if (last) {
            System.out.println(list.size() + 1);
        }

    }
}

package com.github.makewheels.algorithm.exam.e_9_7_baidu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T2 {
    private static final List<Character> list = new ArrayList<>(3);

    static {
        list.add('1');
        list.add('2');
        list.add('3');
    }

    private static boolean is(long n) {
        String str = n + "";
        for (int j = 0; j < str.length(); j++) {
            if (!list.contains(str.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    private static void handle(long n) {
        while (true) {
            if (is(n)) {
                System.out.println(n);
                return;
            }
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = scanner.nextInt();
        for (int i = 0; i < groups; i++) {
            long n = scanner.nextLong();
            handle(n);
        }
    }
}

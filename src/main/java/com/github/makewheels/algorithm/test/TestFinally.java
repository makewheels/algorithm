package com.github.makewheels.algorithm.test;

public class TestFinally {
    public static void main(String[] args) {
        System.out.println(method());
    }

    private static int method() {
        int a = 5;
        try {
            return ++a;
        } finally {
            a = 10;
            return a++;
        }
    }
}

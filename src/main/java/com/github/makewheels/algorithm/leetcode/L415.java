package com.github.makewheels.algorithm.leetcode;

public class L415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int temp = x + y + add;
            stringBuilder.append(temp % 10);
            add = temp / 10;
            i--;
            j--;
        }
        return stringBuilder.reverse().toString();
    }
}
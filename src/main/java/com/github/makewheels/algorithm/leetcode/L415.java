package com.github.makewheels.algorithm.leetcode;

public class L415 {
    public String addStrings(String num1, String num2) {
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        StringBuilder result = new StringBuilder(
                Math.max(num1.length(), num2.length()) + 1);

        boolean carry = false;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 < 0) {
                result.append(num2.charAt(p2));
            } else if (p2 < 0) {
                result.append(num1.charAt(p1));
            } else {
                int value = Integer.parseInt(num1.charAt(p1) + "") +
                        Integer.parseInt(num2.charAt(p2) + "");
                if (carry) {
                    value++;
                    carry = false;
                }
                result.append(value % 10);
                if (value >= 10)
                    carry = true;
            }
            p1--;
            p2--;
        }
        if (carry) {
            result.setCharAt(0, (char) (result.charAt(0) + 1));
        }

        return result.reverse().toString();
    }
}
package com.github.makewheels.algorithm.leetcode;

public class L8 {
    public int myAtoi(String s) {
        while (s.startsWith(" ") || s.startsWith("0")) {
            s = s.substring(1);
        }
        if (s.equals("")) {
            return 0;
        }
        int plusOrMinus = 1;
        if (s.charAt(0) == '+') {
            s = s.substring(1);
        } else if (s.charAt(0) == '-') {
            plusOrMinus = -1;
            s = s.substring(1);
        }
        while (s.startsWith("0")) {
            s = s.substring(1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                s = s.substring(0, i);
                break;
            }
        }
        if (s.length() > (Integer.MAX_VALUE + "").length()) {
            if (plusOrMinus == 1) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }
        long result = 0;
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        for (int i = 0; i < stringBuilder.length(); i++) {
            long temp = 1;
            for (int j = 0; j < i; j++) {
                temp = temp * 10;
            }
            result = result + temp * (stringBuilder.charAt(i) - '0');
        }
        result = result * plusOrMinus;
        if (plusOrMinus == 1) {
            return (int) Math.min(result, Integer.MAX_VALUE);
        } else {
            return (int) Math.max(result, Integer.MIN_VALUE);
        }
    }

    public static void main(String[] args) {
        System.out.println(new L8().myAtoi("9223372036854775808"));
    }
}

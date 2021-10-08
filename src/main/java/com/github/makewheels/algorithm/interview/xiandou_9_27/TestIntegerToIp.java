package com.github.makewheels.algorithm.interview.xiandou_9_27;

public class TestIntegerToIp {
    public static void main(String[] args) {
        int number = 256513315;
        String binary = Integer.toBinaryString(number);
        StringBuilder stringBuilder = new StringBuilder(32);
        for (int i = 0; i < 32 - binary.length(); i++) {
            stringBuilder.append("0");
        }
        binary = stringBuilder + binary;
        String s1 = binary.substring(0, 8);
        String s2 = binary.substring(8, 16);
        String s3 = binary.substring(16, 24);
        String s4 = binary.substring(24, 32);
        String result = Integer.parseInt(s1, 2) + "."
                + Integer.parseInt(s2, 2) + "."
                + Integer.parseInt(s3, 2) + "."
                + Integer.parseInt(s4, 2);
        System.out.println(result);
    }
}

package com.github.makewheels.algorithm.exam.e_9_14_honor;

import java.util.Scanner;

public class T1 {
    private static int getLuckyValue(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - 'a' + 1;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.toLowerCase();
        String[] split = line.split(" ");
        String targetString = split[0];
        int targetValue = getLuckyValue(targetString);

        int minDiffValue = Integer.MAX_VALUE;
        String minString = split[1];
        for (int i = 1; i < split.length; i++) {
            int currentLuckyValue = getLuckyValue(split[i]);
            int currentDiff = Math.abs(currentLuckyValue - targetValue);
            if (currentDiff <= minDiffValue) {
                minDiffValue = currentDiff;
                minString = split[i];
            }
        }
        System.out.println(minString);
    }
}

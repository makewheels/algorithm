package com.github.makewheels.algorithm.exam.topsec_6_26;

import java.util.Arrays;
import java.util.Scanner;

public class TopSec2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();

        Arrays.sort(chars);
        System.out.println(chars);
    }
}
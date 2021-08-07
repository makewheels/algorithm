package com.github.makewheels.algorithm.exam.topsec;

import java.util.Scanner;

public class TopSec1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int english = 0;
        int space = 0;
        int number = 0;
        int etc = 0;
        char[] chars = line.toCharArray();
        for (char c : chars) {
            if (Character.isAlphabetic(c))
                english++;
            else if (Character.isSpaceChar(c))
                space++;
            else if (Character.isDigit(c))
                number++;
            else
                etc++;
        }
        System.out.println("英文字母: " + english);
        System.out.println("空格: " + space);
        System.out.println("数字: " + number);
        System.out.println("其它字符: " + etc);
    }
}

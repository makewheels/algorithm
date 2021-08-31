package com.github.makewheels.algorithm.exam.minglue_8_31;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] arr = line.split(",");
        float f1 = Float.parseFloat(arr[0]);
        float f2 = Float.parseFloat(arr[1]);
        System.out.println(f1 + f2);
    }
}

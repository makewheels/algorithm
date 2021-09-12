package com.github.makewheels.algorithm.exam.e_8_28_iflytek;

import java.util.*;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] scoreStringArr = scanner.nextLine().split(" ");
        int[] scoreArr = new int[scoreStringArr.length];
        for (int i = 0; i < scoreStringArr.length; i++) {
            scoreArr[i] = Integer.parseInt(scoreStringArr[i]);
        }
        int niuScore = Integer.parseInt(scanner.nextLine());
        Arrays.sort(scoreArr);
        List<Integer> scores = new ArrayList<>();
        for (int i = scoreArr.length - 1; i >= 0; i--) {
            scores.add(scoreArr[i]);
        }
        int index = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            if (scores.get(i) == niuScore) {
                index = i;
                break;
            }
        }
        index++;
        if (index <= 5) {
            System.out.println("A+");
        } else if (index <= 15) {
            System.out.println("A0");
        } else if (index <= 30) {
            System.out.println("B+");
        } else if (index <= 35) {
            System.out.println("B0");
        } else if (index <= 45) {
            System.out.println("C+");
        } else if (index <= 48) {
            System.out.println("C0");
        } else {
            System.out.println("F");
        }
    }
}

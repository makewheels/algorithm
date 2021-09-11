package com.github.makewheels.algorithm.exam.tianyiyun_9_11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String maxStr = "";
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (!set.contains(rightChar)) {
                set.add(rightChar);
                String substring = s.substring(left, right + 1);
                if (substring.length() > maxStr.length()) {
                    maxStr = substring;
                }
            } else {
                while (set.contains(rightChar)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(rightChar);
            }
            right++;
        }
        System.out.println(maxStr.length());
    }
}

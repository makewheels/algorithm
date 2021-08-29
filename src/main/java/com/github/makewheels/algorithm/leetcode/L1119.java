package com.github.makewheels.algorithm.leetcode;

public class L1119 {
    public String removeVowels(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}

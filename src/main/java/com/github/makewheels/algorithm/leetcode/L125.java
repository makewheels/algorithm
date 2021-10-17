package com.github.makewheels.algorithm.leetcode;

public class L125 {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(c);
            }
        }
        String original = stringBuilder.toString();
        return original.equalsIgnoreCase(stringBuilder.reverse().toString());
    }
}

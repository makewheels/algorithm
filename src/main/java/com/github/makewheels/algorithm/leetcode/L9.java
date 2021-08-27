package com.github.makewheels.algorithm.leetcode;

public class L9 {
    public boolean isPalindrome(int x) {
        String str = x + "";
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new L9().isPalindrome(123));
    }
}

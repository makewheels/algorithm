package com.github.makewheels.algorithm.exam.e_9_13_tuhu;

public class T1 {
    private boolean isHuiwen(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private String deleteCharAt(String str, int index) {
        return str.substring(0, index) + str.substring(index + 1);
    }

    public boolean validPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        if (isHuiwen(s)) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            String delStr = deleteCharAt(s, i);
            if (isHuiwen(delStr)) {
                return true;
            }
        }
        return false;
    }
}

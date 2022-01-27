package com.github.makewheels.algorithm.leetcode;

import java.util.regex.Pattern;

public class L2047 {
    private int countChar(String str, char target) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                result++;
            }
        }
        return result;
    }

    private boolean isBiaoDian(char c) {
        return c == '!' || c == '.' || c == ',';
    }

    private int countBiaoDian(String str) {
        return countChar(str, '!') + countChar(str, '.') + countChar(str, ',');
    }

    public int countValidWords(String sentence) {
        String[] arr = sentence.split(" +");
        int result = 0;
        for (String each : arr) {
            //仅由小写字母、连字符和/或标点（不含数字）
            if (Pattern.compile("[0-9]{1,}").matcher(each).matches()) {
                continue;
            }
            //至多一个 连字符 '-'
            if (countChar(each, '-') >= 2) {
                continue;
            }
            //至多一个 连字符 '-' 。如果存在，连字符两侧应当都存在小写字母（"a-b" 是一个有效单词，
            // 但 "-ab" 和 "ab-" 不是有效单词）。
            if (each.startsWith("-") || each.endsWith("-")) {
                continue;
            }
            //至多一个 标点符号
            int countBiaoDian = countBiaoDian(each);
            if (countBiaoDian(each) >= 2) {
                continue;
            }
            //至多一个 标点符号。如果存在，标点符号应当位于 token 的 末尾
            if (countBiaoDian >= 1) {

                if (each.startsWith("!") || each.startsWith(".") || each.startsWith(",")) {
                    continue;
                }

            }
            result++;
        }
        return result;
    }
}

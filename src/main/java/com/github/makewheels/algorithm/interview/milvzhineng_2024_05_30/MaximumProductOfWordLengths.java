package com.github.makewheels.algorithm.interview.milvzhineng_2024_05_30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumProductOfWordLengths {
    // 最大单词长度乘积
    // https://leetcode.cn/problems/maximum-product-of-word-lengths
    // 有一个字符串数组，每个字符串都只包含小写字母，现在需要找到两个长度相乘最大的字符串，
    // 并且两个字符串不能有相同的字母，如果没有满足这个条件的结果，返回0
    //
    // Input: ["abcw","baz","foo","bar","xtfn","abcdef"]
    // Output: 16
    //
    // Input: ["a","aa","aaa","aaaa"]
    // Output: 0

    private static Map<String, Set<Character>> getCharMap(String[] s) {
        Map<String, Set<Character>> map = new HashMap<>();
        for (String str : s) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }
            map.put(str, set);
        }
        return map;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        Map<String, Set<Character>> charMap = getCharMap(s);
        int ans = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                Set<Character> charSet1 = charMap.get(s[i]);
                Set<Character> charSet2 = charMap.get(s[j]);
                boolean contains = false;
                for (Character c : charSet1) {
                    if (charSet2.contains(c)) {
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    ans = Math.max(ans, s[i].length() * s[j].length());
                }
            }
        }
        System.out.println(ans);
    }
}

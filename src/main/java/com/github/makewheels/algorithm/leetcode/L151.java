package com.github.makewheels.algorithm.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L151 {
    public String reverseWords(String s) {
        String[] split = s.trim().split("\\s+");
        List<String> strings = Arrays.asList(split);
        Collections.reverse(strings);
        return String.join(" ", strings);
    }
}

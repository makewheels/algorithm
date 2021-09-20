package com.github.makewheels.algorithm.exam.e_9_20_dada;

import java.util.HashSet;
import java.util.Set;

public class T1 {
    public int lengthOfLongestSubstring (String s) {
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
        return maxStr.length();
    }
}

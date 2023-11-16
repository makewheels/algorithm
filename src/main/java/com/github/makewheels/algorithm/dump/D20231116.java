package com.github.makewheels.algorithm.dump;

import java.util.HashSet;
import java.util.Set;

public class D20231116 {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length() - 1) {
            if (set.contains(s.charAt(right))) {
                left = right + 1;
                right = left + 1;
            } else {
                set.add(s.charAt(right));
                right++;
                result = Math.max(right - left, result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new D20231116().lengthOfLongestSubstring("pwwkew");
    }
}

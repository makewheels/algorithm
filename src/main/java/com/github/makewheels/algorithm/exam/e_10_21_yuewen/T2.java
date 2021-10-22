package com.github.makewheels.algorithm.exam.e_10_21_yuewen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T2 {
    private final List<List<Character>> ans = new ArrayList<>();
    private boolean[] used;
    private final List<Character> per = new ArrayList<>();

    public List<List<Character>> permute(char[] nums) {
        used = new boolean[nums.length];
        Arrays.fill(used, false);
        find(nums);
        return ans;
    }

    private void find(char[] nums) {
        if (per.size() == nums.length) {
            ans.add(new ArrayList<>(per));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                per.add(nums[i]);

                find(nums);

                used[i] = false;
                per.remove(per.size() - 1);
            }
        }
    }

    public boolean checkInclusion(String s1, String s2) {
        find(s1.toCharArray());
        for (List<Character> each : ans) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Character c : each) {
                stringBuilder.append(c);
            }
            String s = stringBuilder.toString();
            if (s2.contains(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new T2().checkInclusion("ab", "eidboaoo");
    }
}

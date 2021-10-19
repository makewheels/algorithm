package com.github.makewheels.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L46 {
    private final List<List<Integer>> ans = new ArrayList<>();
    private boolean[] used;
    private final List<Integer> per = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        Arrays.fill(used, false);
        find(nums);
        return ans;
    }

    private void find(int[] nums) {
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
}

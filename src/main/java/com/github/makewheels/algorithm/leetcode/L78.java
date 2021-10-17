package com.github.makewheels.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L78 {
    private final List<List<Integer>> ans = new ArrayList<>();
    private final List<Integer> set = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return ans;
    }

    private void dfs(int[] nums, int index) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(set));
            return;
        }
        dfs(nums, index + 1);

        set.add(nums[index]);
        dfs(nums, index + 1);
        set.remove(set.size() - 1);
    }

    public static void main(String[] args) {
        new L78().subsets(new int[]{1, 2, 3});
    }
}

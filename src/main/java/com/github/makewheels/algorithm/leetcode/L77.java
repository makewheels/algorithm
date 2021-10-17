package com.github.makewheels.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L77 {

    private final List<List<Integer>> ans = new ArrayList<>();
    private final List<Integer> set = new ArrayList<>();

    private int n;
    private int k;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        int[] nums = new int[n];
        dfs(1);
        return ans;
    }

    private void dfs(int index) {
        //剪枝条件
        if (set.size() + n - index + 1 < k) {
            return;
        }
        //加入结果条件
        if (set.size() == k) {
            ans.add(new ArrayList<>(set));
            return;
        }

        //直接搜索
        dfs(index + 1);

        //添加当前位置之后搜索
        set.add(index);
        dfs(index + 1);
        set.remove(set.size() - 1);
    }
}

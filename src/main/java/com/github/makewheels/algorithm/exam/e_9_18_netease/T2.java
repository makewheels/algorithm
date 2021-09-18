package com.github.makewheels.algorithm.exam.e_9_18_netease;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T2 {
    private static final List<int[]> freq = new ArrayList<>();
    private static final List<List<Integer>> ans = new ArrayList<>();
    private static final List<Integer> sequence = new ArrayList<>();

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int num : candidates) {
            int size = freq.size();
            if (freq.isEmpty() || num != freq.get(size - 1)[0]) {
                freq.add(new int[]{num, 1});
            } else {
                ++freq.get(size - 1)[1];
            }
        }
        dfs(0, target);
        return ans;
    }

    private static void dfs(int pos, int rest) {
        if (rest == 0) {
            ans.add(new ArrayList<>(sequence));
            return;
        }
        if (pos == freq.size() || rest < freq.get(pos)[0]) {
            return;
        }
        dfs(pos + 1, rest);
        int temp = freq.get(pos)[0];
        if (temp == 0) {
            temp = 1;
        }
        int most = Math.min(rest / temp, freq.get(pos)[1]);
        for (int i = 1; i < most; i++) {
            sequence.add(freq.get(pos)[0]);
            dfs(pos + 1, rest - i * freq.get(pos)[0]);
        }
        for (int i = 1; i <= most; i++) {
            sequence.remove(sequence.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        List<Integer> candidateList = new ArrayList<>();
        candidateList.add(1);
        int value = 1;
        while (true) {
            value = value * 2;
            if (value < s) {
                candidateList.add(value);
            } else {
                break;
            }
        }
        int[] arr = new int[candidateList.size()];
        List<List<Integer>> list = combinationSum2(arr, s);
        int result = Integer.MAX_VALUE;
        for (List<Integer> integers : list) {
            if (integers.size() < result) {
                result = integers.size();
            }
        }
        System.out.println(result);
    }
}

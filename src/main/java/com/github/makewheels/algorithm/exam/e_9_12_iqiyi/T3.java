package com.github.makewheels.algorithm.exam.e_9_12_iqiyi;

import java.util.*;

public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replace("[ ", "");
        line = line.replace("] ", "");
        String[] split = line.split(", ");
        int[][] intervals = new int[split.length][2];
        for (int i = 0; i < split.length; i++) {
            String each = split[i];
            each = each.replace("[", "");
            each = each.replace("]", "");
            String[] twoNums = each.split(",");
            int[] ints = new int[2];
            for (int j = 0; j < 2; j++) {
                ints[j] = Integer.parseInt(twoNums[j]);
            }
            intervals[i] = ints;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int n = intervals.length;
        int[] f = new int[n];
        Arrays.fill(f, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (intervals[j][1] <= intervals[i][0]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
        }
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < f.length; i++) {
            s.add(i);
        }
        if (s.size() == 1) {
            System.out.println(0);
            return;
        }
        System.out.println(n - Arrays.stream(f).max().getAsInt());
    }
}

package com.github.makewheels.algorithm.interview.mijinzhineng_2024_05_30;

import java.util.Arrays;

public class MinimumPathSum {
    /**
     * <a href="https://leetcode.cn/problems/minimum-path-sum/description/">最小路径和</a>
     * <p>
     * // 从上到下找到最短路径（n个数字之和最小,n为矩阵的行数），可以从第一行中的任何元素开始，
     * 只能往下层走，同时只能走向相邻的节点，
     * 例如图中第一排 2 只能走向 第二排的 7、3；第二排的 7 可以走向第三排的 6、2、9
     * //
     * // | 5    | 8    | 1    | 2    |
     * // | 4    | 1    | 7    | 3    |
     * // | 3    | 6    | 2    | 9    |
     * //
     * // Input: [
     * //     [5, 8, 1, 2],
     * //     [4, 1, 7, 3],
     * //     [3, 6, 2, 9]
     * // ]
     * // Output: 4
     * <p>
     * import java.util.*;
     * <p>
     * public class ShowMeBug {
     * public static void main(String[] args) {
     * int[][] matrix = new int[][]{
     * {5, 8, 1, 2},
     * {4, 1, 7, 3},
     * {3, 6, 2, 9}
     * };
     * }
     * }
     */

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {5, 8, 1, 2},
                {4, 1, 7, 3},
                {3, 6, 2, 9}
        };

        for (int i = 1; i < matrix.length; i++) {
            int[] line = matrix[0];
            for (int j = 0; j < line.length; j++) {
                int left = matrix[Math.min(i + 1, matrix.length - 1)][Math.max(j - 1, 0)];
                int bottom = matrix[Math.min(i + 1, matrix.length - 1)][j];
                int right = matrix[Math.min(i + 1, matrix.length - 1)][Math.min(j + 1, line.length - 1)];
                int min = Math.min(left, bottom);
                min = Math.min(min, right);
                matrix[i][j] = min;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        int ans = Arrays.stream(matrix[matrix.length - 1]).min().getAsInt();
        System.out.println(ans);
    }
}

package com.github.makewheels.algorithm.exam.e_9_5_freewheel;

import java.util.Arrays;

class Node implements Comparable<Node> {
    public int[] a;
    public int x;

    public Node(int[] a, int x) {
        this.a = new int[3];
        System.arraycopy(a, 0, this.a, 0, 3);
        Arrays.sort(this.a);
        this.x = x;
    }

    @Override
    public int compareTo(Node o) {
        for (int i = 2; i >= 0; --i) {
            if (this.a[i] != o.a[i]) {
                return o.a[i] - this.a[i];
            }
        }
        return 0;
    }
}

public class T3 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 给定每个广告订单的3个广告素材时长a,b,c和预期投放次数x，
     * 计算满足题目要求的最优广告投放计划，并返回Pre-Roll总的广告投放时长的最大值
     *
     * @param orders int整型二维数组 二维数组，每个订单是一行，每一行是长度为4的数组，分别为a,b,c,x
     * @return int整型
     */
    public int maxPreRolDuration(int[][] orders) {
        int n = orders.length;
        Node[] arr = new Node[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = new Node(orders[i], orders[i][3]);
        }
        Arrays.sort(arr);
        int[][] dp = new int[121][121];
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int mx = 0;
            for (int j = arr[i].a[0]; j <= 120; ++j) {
                for (int k = arr[i].a[1]; k <= 120; ++k) {
                    mx = Math.max(mx, dp[j][k]);
                }
            }
            for (int j = 0; j <= arr[i].a[0]; ++j) {
                for (int k = 0; k <= arr[i].a[1]; ++k) {
                    dp[j][k] = Math.max(dp[j][k], mx + arr[i].a[2] * arr[i].x);
                    ans = Math.max(ans, dp[j][k]);
                }
            }
        }

        return ans;
    }
}

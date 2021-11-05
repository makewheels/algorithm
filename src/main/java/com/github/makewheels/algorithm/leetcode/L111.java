package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.basic.bean.TreeNode;

public class L111 {
    public int minDepth(TreeNode root) {

        //我本身就没有
        if (root == null)
            return 0;
        //左右都不为空，那就是1
        if (root.left == null && root.right == null)
            return 1;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        //左右有一个为空，那以多的为准
        if (root.left == null || root.right == null)
            return left + right + 1;
        //左右都不为空
        return Math.min(left, right) + 1;

    }

}

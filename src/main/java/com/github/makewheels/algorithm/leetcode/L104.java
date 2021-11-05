package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.basic.bean.TreeNode;

public class L104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.basic.bean.TreeNode;

public class L222 {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}

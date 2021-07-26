package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.TreeNode;

public class T222 {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}

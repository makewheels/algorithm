package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.TreeNode;

public class L98 {
    public boolean isValidBST(TreeNode root) {
        return isValidNode(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidNode(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;

        return isValidNode(node.left, min, node.val) && isValidNode(node.right, node.val, max);
    }
}

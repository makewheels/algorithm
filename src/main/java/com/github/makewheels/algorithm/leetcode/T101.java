package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.TreeNode;

public class T101 {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        return left.val == right.val
                && check(left.left, right.right)
                && check(left.right, right.left);
    }
}

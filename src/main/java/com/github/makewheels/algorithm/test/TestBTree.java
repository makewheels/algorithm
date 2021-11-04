package com.github.makewheels.algorithm.test;

import com.github.makewheels.algorithm.bean.TreeNode;

public class TestBTree {
    public boolean isPTree(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            int diff = Math.abs(getHeight(root.left) - getHeight(root.right));
            return diff <= 1 && isPTree(root.left) && isPTree(root.right);
        }
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            return Math.max(left, right) + 1;
        }
    }
}

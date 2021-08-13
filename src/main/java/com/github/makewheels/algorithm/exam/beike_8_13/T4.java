package com.github.makewheels.algorithm.exam.beike_8_13;

import com.github.makewheels.algorithm.bean.TreeNode;

public class T4 {
    public int maxSubTree(TreeNode root) {
        return visit(root.left, root.right);
    }

    int count = 0;

    private int visit(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return 0;
        } else if (left.val != right.val) {
            return 0;
        }
        count++;
        return count;
    }
}

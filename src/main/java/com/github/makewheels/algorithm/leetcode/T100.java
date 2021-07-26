package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.TreeNode;

public class T100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        else if ((p.val != q.val))
            return false;
        else
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

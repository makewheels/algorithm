package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.TreeNode;

public class L226 {
    public TreeNode invertTree(TreeNode root) {
        //结束条件
        if (root == null)
            return null;
        //交换
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        //递归
        invertTree(root.left);
        invertTree(root.right);
        //返回
        return root;
    }
}

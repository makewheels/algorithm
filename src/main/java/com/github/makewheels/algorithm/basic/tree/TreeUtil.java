package com.github.makewheels.algorithm.basic.tree;

import com.github.makewheels.algorithm.basic.bean.TreeNode;

public class TreeUtil {
    public static TreeNode createTree() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode t9 = new TreeNode(9);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t3.right = t6;

        t5.left = t7;

        t6.right = t8;

        t8.left = t9;

        return t1;
    }
}

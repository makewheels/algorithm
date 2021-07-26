package com.github.makewheels.algorithm.basic.tree;

import com.github.makewheels.algorithm.bean.TreeNode;
import org.junit.Test;

public class TraversingBinaryTree {

    public void firstOrder(TreeNode root) {
        System.out.print(root.val + " ");
        if (root.left != null)
            firstOrder(root.left);
        if (root.right != null)
            firstOrder(root.right);
    }

    public void middleOrder(TreeNode root) {
        if (root.left != null)
            firstOrder(root.left);
        System.out.print(root.val + " ");
        if (root.right != null)
            firstOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root.left != null)
            firstOrder(root.left);
        if (root.right != null)
            firstOrder(root.right);
        System.out.print(root.val + " ");
    }

    @Test
    public void runFirstOrder() {
        firstOrder(TreeUtil.createTree());
    }

    @Test
    public void runMiddleOrder() {
        middleOrder(TreeUtil.createTree());
    }

    @Test
    public void runPostOrder() {
        postOrder(TreeUtil.createTree());
    }
}

package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class T112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> values = new LinkedList<>();
        nodes.offer(root);
        values.offer(root.val);
        while (!nodes.isEmpty()) {
            TreeNode pollNode = nodes.poll();
            int pollValue = values.poll();
            if (pollNode.left == null && pollNode.right == null && pollValue == targetSum)
                return true;
            if (pollNode.left != null) {
                nodes.offer(pollNode.left);
                values.offer(pollValue + pollNode.left.val);
            }
            if (pollNode.right != null) {
                nodes.offer(pollNode.right);
                values.offer(pollValue + pollNode.right.val);
            }
        }
        return false;
    }
}

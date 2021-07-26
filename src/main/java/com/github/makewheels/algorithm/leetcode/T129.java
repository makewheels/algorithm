package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class T129 {
    public int sumNumbers(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> values = new LinkedList<>();
        nodes.offer(root);
        values.offer(root.val);
        int result = 0;
        while (!nodes.isEmpty()) {
            TreeNode pollNode = nodes.poll();
            int pollValue = values.poll();
            //如果是叶子节点，直接加进去
            if (pollNode.left == null && pollNode.right == null) {
                result += pollValue;
            }
            if (pollNode.left != null) {
                nodes.offer(pollNode.left);
                values.offer(pollValue * 10 + pollNode.left.val);
            }
            if (pollNode.right != null) {
                nodes.offer(pollNode.right);
                values.offer(pollValue * 10 + pollNode.right.val);
            }
        }
        return result;
    }
}

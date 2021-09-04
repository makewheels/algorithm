package com.github.makewheels.algorithm.interview.tencent_changsha_yiliao_9_4;

import com.github.makewheels.algorithm.basic.tree.TreeUtil;
import com.github.makewheels.algorithm.bean.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class T1 {
    private void r(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int levelCount = 0;
        while (!queue.isEmpty()) {
            levelCount++;
            Deque<TreeNode> levelQueue = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (levelCount % 2 == 0) {
                    levelQueue.offerLast(node);
                } else {
                    levelQueue.offerFirst(node);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            for (int i = 0; i < levelQueue.size(); i++) {
                System.out.println(levelQueue.poll().val);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.createTree();
        new T1().r(root);
    }
}

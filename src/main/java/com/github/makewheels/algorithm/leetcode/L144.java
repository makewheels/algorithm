package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.basic.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L144 {
    public void preorder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        preorder(node.left, list);
        list.add(node.val);
        preorder(node.right, list);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new L144().preorderTraversal(null));
    }
}

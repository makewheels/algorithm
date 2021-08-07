package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.ListNode;

public class L2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        ListNode listNode = new ListNode(l1.val + l2.val);
        result.next = listNode;

        return null;
    }
}

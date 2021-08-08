package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.ListNode;

public class L2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode tail = null;
        while (l1 != null || l2 != null) {
            int value1 = 0;
            if (l1 != null)
                value1 = l1.val;
            int value2 = 0;
            if (l2 != null)
                value2 = l2.val;
            int sum = value1 + value2;
            if (head == null) {
                head = new ListNode(sum % 10);
            } else {
                head.next = new ListNode(sum % 10);
            }
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return head;

    }
}
package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.basic.bean.ListNode;

public class L21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode each = null;
        while (l1 != null || l2 != null) {
            int value;
            if (l1 == null) {
                value = l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                value = l1.val;
                l1 = l1.next;
            } else {
                if (l1.val < l2.val) {
                    value = l1.val;
                    l1 = l1.next;
                } else {
                    value = l2.val;
                    l2 = l2.next;
                }
            }

            if (head == null) {
                head = new ListNode(value);
                each = head;
            } else {
                each.next = new ListNode(value);
                each = each.next;
            }

        }
        return head;
    }

}

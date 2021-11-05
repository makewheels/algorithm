package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.basic.bean.ListNode;

public class L24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode each = dummyHead;
        while (each.next != null && each.next.next != null) {
            ListNode n1 = each.next;
            ListNode n2 = each.next.next;

            each.next = n2;
            n1.next = n2.next;
            n2.next = n1;

            each = each.next.next;
        }
        return dummyHead.next;
    }
}

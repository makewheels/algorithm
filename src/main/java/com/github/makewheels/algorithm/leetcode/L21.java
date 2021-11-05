package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.basic.bean.ListNode;

public class L21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode each = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                each.next = l1;
                l1 = l1.next;
            } else {
                each.next = l2;
                l2 = l2.next;
            }
            each = each.next;
        }
        if (l1 != null) {
            each.next = l1;
        } else {
            each.next = l2;
        }
        return dummyHead.next;
    }

}

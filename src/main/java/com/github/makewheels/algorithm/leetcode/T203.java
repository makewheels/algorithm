package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.ListNode;

public class T203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode each = head;
        while (each != null) {
            if (each.val == val) {
                if (each.next == null) {
                    each = null;
                } else {
                    each.next = each.next.next;
                    continue;
                }
            }
            each = each.next;
        }
        return head;
    }
}

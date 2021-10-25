package com.github.makewheels.algorithm.interview.jingdong_10_25;

import com.github.makewheels.algorithm.bean.ListNode;

public class TestMergeTwoLinkedListsBianli {
    public ListNode mergeTwoLinkedLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode each = head;
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
        if (l1 == null) {
            each.next = l2;
        } else {
            each.next = l1;
        }
        return head.next;
    }
}

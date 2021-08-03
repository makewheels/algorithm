package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.ListNode;

public class T25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode each = dummyHead;
        while (each.next != null && each.next.next != null) {

        }
        return dummyHead.next;
    }

    private ListNode reverseList(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            cur.next = cur;
            cur = cur.next;
        }
        return cur;
    }
}

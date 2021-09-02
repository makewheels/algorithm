package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.ListNode;

public class L206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        return pre;
    }
}

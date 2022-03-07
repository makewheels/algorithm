package com.github.makewheels.algorithm.leetcode_exercise;

import com.github.makewheels.algorithm.basic.bean.ListNode;

public class L206_0130 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

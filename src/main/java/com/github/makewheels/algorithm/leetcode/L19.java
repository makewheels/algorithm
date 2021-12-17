package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.basic.bean.ListNode;

public class L19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = new ListNode(0, head);
        ListNode slow = new ListNode(0, head);
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast.next == null) {
            fast = null;
            return head;
        }
        fast = fast.next;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

package com.github.makewheels.algorithm.exam.e_9_29_shuidi;

import com.github.makewheels.algorithm.bean.ListNode;

public class T1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

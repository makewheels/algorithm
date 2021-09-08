package com.github.makewheels.algorithm.exam.lilisi_9_7;

import com.github.makewheels.algorithm.bean.ListNode;

public class T1 {
    public ListNode formatList(ListNode head) {
        ListNode start = null;
        ListNode end = null;
        int count = 0;
        while (head.next != null) {
            count++;
            if (count % 2 != 0) {
                ListNode temp = start.next;
                start.next = head;
                head.next = temp;
            } else {
                end.next = head;
            }
            head = head.next;
        }
        return start;
    }
}
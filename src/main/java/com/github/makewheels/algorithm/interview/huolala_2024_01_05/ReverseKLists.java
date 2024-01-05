package com.github.makewheels.algorithm.interview.huolala_2024_01_05;

import com.github.makewheels.algorithm.basic.bean.ListNode;

public class ReverseKLists {
    private ListNode reverse(ListNode start, ListNode end) {
        ListNode pre = null;
        ListNode after;
        ListNode cur = start;
        while (cur != end) {
            after = cur.next;
            cur.next = pre;
            pre = cur;
            cur = after;
        }
        return pre;
    }

    public void reverseKLists(ListNode list, int k) {
        ListNode start = list;
        ListNode end = list;
        ListNode pre;
        while (end.next != null) {
            pre = end;
            for (int i = 0; i < k; i++) {
                end = end.next;
            }
            pre.next= reverse(start, end);
            start = end;
        }
    }
}

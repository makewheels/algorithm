package com.github.makewheels.algorithm.nowcoder;

import com.github.makewheels.algorithm.bean.ListNode;

public class NC78 {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode left = head;
        ListNode right = head;
        while (right != null) {
            right = left.next;
            left.next = left;
            left = right;
            right = right.next;
        }
        return right;
    }
}

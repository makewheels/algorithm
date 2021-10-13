package com.github.makewheels.algorithm.nowcoder;

import com.github.makewheels.algorithm.bean.ListNode;

/**
 * https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca
 */
public class NC78 {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        ListNode prev = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}

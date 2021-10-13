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

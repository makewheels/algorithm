package com.github.makewheels.algorithm.interview.zhihu_8_7;

import com.github.makewheels.algorithm.basic.bean.ListNode;

public class ReverseListNode {
    public static void main(String[] args) {
        ListNode n0 = new ListNode(0);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n0.next = n1;
        n1.next = n2;

        ListNode each = n0;
        while (true) {
            ListNode next = each.next;
            if (next == null) {
                break;
            }
            each.next = each;
            each = next;
        }
    }
}

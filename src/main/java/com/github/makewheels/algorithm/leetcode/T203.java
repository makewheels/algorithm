package com.github.makewheels.algorithm.leetcode;

import com.github.makewheels.algorithm.bean.ListNode;

public class T203 {
    public ListNode removeElements(ListNode head, int val) {
        //没有节点
        if (head == null)
            return null;
        //只有一个节点
        if (head.next == null) {
            if (head.val == val) {
                head = null;
            }
            return head;
        }

        //有两个节点
        //解决头结点
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null)
            return null;
        //头结点不是要删的了
        ListNode pre = head;
        ListNode each = head.next;
        while (each != null) {
            boolean isDelete = false;
            if (each.val == val) {
                pre.next = each.next;
                isDelete = true;
            }
            each = each.next;
            if (!isDelete)
                pre = pre.next;
        }
        return head;
    }
}

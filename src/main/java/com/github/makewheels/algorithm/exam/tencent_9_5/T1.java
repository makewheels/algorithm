package com.github.makewheels.algorithm.exam.tencent_9_5;

import com.github.makewheels.algorithm.bean.ListNode;

public class T1 {
    public ListNode solve(ListNode[] a) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        boolean flag = true;
        while (flag) {
            int countFalse = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != null) {
                    res.next = new ListNode(a[i].val);
                    res = res.next;
                    a[i] = a[i].next;
                } else {
                    countFalse++;
                }
                if (countFalse == a.length) {
                    flag = false;
                }
            }
        }
        return head.next;
    }

}

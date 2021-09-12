package com.github.makewheels.algorithm.exam.e_8_15_haoweilai;

import com.github.makewheels.algorithm.bean.ListNode;

public class T2 {
    public ListNode reverseKGroup(ListNode list, int k) {
        ListNode left = list;
        ListNode temp = list;
        ListNode right = list;
        for (int i = 0; i < k; i++) {
            right = right.next;
            if (right.next == null) {
                break;
            }
        }
        while (temp != right) {
            ListNode n1 = temp;
            ListNode n2 = temp.next;
            temp.next = left;
            left.next = null;
            left = n1;
            right = n2;
        }
        return left;

    }
}

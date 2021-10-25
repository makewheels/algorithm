package com.github.makewheels.algorithm.interview.jingdong_10_25;

import com.github.makewheels.algorithm.bean.ListNode;

public class TestMergeTwoLinkedListsDigui {
    public ListNode mergeTwoLinkedLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLinkedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLinkedLists(l1, l2.next);
            return l2;
        }
    }
}

package com.github.makewheels.algorithm.basic.linkedlist;

import com.github.makewheels.algorithm.basic.bean.ListNode;
import com.github.makewheels.algorithm.basic.sort.SortUtil;

public class LinkedListUtil {
    public static ListNode getLinkedList() {
        int[] arr = SortUtil.getArray();
        ListNode dummyHead = new ListNode();
        ListNode each = dummyHead;
        for (int value : arr) {
            each.next = new ListNode(value);
            each = each.next;
        }
        return dummyHead.next;
    }

    public static void print(ListNode head) {
        ListNode each = head;
        while (each != null) {
            System.out.print(each.val);
            if (each.next != null) {
                System.out.print(" -> ");
            }
            each = each.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode linkedList = LinkedListUtil.getLinkedList();
        LinkedListUtil.print(linkedList);
    }
}

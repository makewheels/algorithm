package com.github.makewheels.algorithm.test;

public class TestReverseLinkedList {

    static class Node {
        int val;
        Node next;

        public Node() {

        }
    }

    private static Node getLinkedList() {
        Node head = new Node();
        head.val = 1;
        Node cur = head;
        for (int i = 2; i <= 9; i++) {
            Node newNode = new Node();
            newNode.val = i;
            cur.next = newNode;
            cur = cur.next;
        }
        return head;
    }

    private static Node reverse(Node head) {
        Node pre = null;
        Node cur = head;
        Node after;
        while (cur != null) {
            after = cur.next;
            cur.next = pre;
            pre = cur;
            cur = after;
        }
        return pre;
    }

    private static void print(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node linkedList = getLinkedList();
        print(linkedList);
        Node reverseList = reverse(linkedList);
        print(reverseList);
    }
}

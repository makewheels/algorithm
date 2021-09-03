package com.github.makewheels.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L146 {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, Node> map = new HashMap<>();
    private int size;
    private int capacity;
    private Node head, tail;

    class LRUCache {

        public LRUCache(int capacity) {
            size = 0;
            capacity = capacity;
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            return 0;
        }

        public void put(int key, int value) {

        }
    }
}

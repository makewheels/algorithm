package com.github.makewheels.algorithm.interview.jingyu_2024_07_20;

import java.util.HashMap;
import java.util.Map;

public class Lru {
    public Lru(int capacity) {
        this.init(capacity);
    }

    static class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }

    int capacity;
    int size = 0;
    Node head = new Node();
    Node tail = new Node();
    Map<Integer, Node> map = new HashMap<>();

    private void init(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        // 存在
        if (node != null) {
            moveToHead(node);
            return node.value;
        }
        // 不存在
        return -1;
    }

    public void set(int key, int value) {
        Node node = map.get(key);
        // 存在
        if (node != null) {
            node.value = value;
            moveToHead(node);
        } else {
            // 不存在
            node = new Node();
            node.key = key;
            node.value = value;
            map.put(key, node);
            addToHead(node);
            size++;
            if (size > capacity) {
                map.remove(tail.prev.key);
                deleteTail();
                size--;
            }
        }
    }

    public void delete(int key) {
        Node node = map.get(key);
        map.remove(key);
        size--;
        unlinkNode(node);
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void unlinkNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = null;
        node.next = null;
    }

    private void moveToHead(Node node) {
        unlinkNode(node);
        addToHead(node);
    }

    private void deleteTail() {
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
    }

    public void printNodeList() {
        Node cur = head.next;
        while (cur != tail) {
            System.out.print("[" + cur.key + ":" + cur.value + "], ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lru lru = new Lru(5);
        lru.set(1, 1);
        lru.printNodeList();
        lru.set(2, 2);
        lru.printNodeList();
        lru.set(3, 3);
        lru.printNodeList();
        lru.set(4, 4);
        lru.printNodeList();
        lru.set(5, 5);
        lru.printNodeList();
        lru.set(2, 0);
        lru.printNodeList();

        System.out.println("GET " + lru.get(3));
        lru.printNodeList();
        System.out.println("GET " + lru.get(2));
        lru.printNodeList();
    }
}

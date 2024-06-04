package com.github.makewheels.algorithm.interview.milvzhineng_2024_05_30;

import com.google.common.collect.Lists;

import java.util.*;

public class BuildTreeNodes {
    // 现在数据库有一张表，用来存储一个多叉树，id为主键，pid 表示父节点的 id，
    // 已知 "-1" 表示根节点，现在要求打印出从根节点到每个子节点的路径（可以是无序的）。
    //
    // | id      | pid    |
    // |---------|--------|
    // | "A"     | "-1"   |
    // | "A-1"   | "A"    |
    // | "A-2"   | "A"    |
    // | "A-3"   | "A"    |
    // | "A-2-1" | "A-2"  |
    // | "A-2-2" | "A-2"  |
    // | "A-2-3" | "A-2"  |
    //
    // Input: [
    //   {
    //       "id": "A",
    //       "pid": "-1"
    //   },
    //   {
    //       "id": "A-1",
    //       "pid": "A"
    //   },
    //   {
    //       "id": "A-2",
    //       "pid": "A"
    //   },
    //   {
    //       "id": "A-3",
    //       "pid": "A"
    //   },
    //   {
    //       "id": "A-2-1",
    //       "pid": "A-2"
    //   },
    //   {
    //       "id": "A-2-2",
    //       "pid": "A-2"
    //   },
    //   {
    //       "id": "A-2-3",
    //       "pid": "A-2"
    //   }
    // ]
    // Output: [
    //   "/A",
    //   "/A/A-1",
    //   "/A/A-2",
    //   "/A/A-3",
    //   "/A/A-2/A-2-1",
    //   "/A/A-2/A-2-2",
    //   "/A/A-2/A-2-3",
    // ]

    static class Node {
        Node(String ID, String PID) {
            this.ID = ID;
            this.PID = PID;
        }

        public String ID; // 节点ID
        public String PID; // 父节点ID
    }

    private static List<String> getLeafNodes(List<Node> nodes) {
        Set<String> pidSet = new TreeSet<>();
        for (Node node : nodes) {
            pidSet.add(node.ID);
            pidSet.add(node.PID);
        }
        pidSet.remove("-1");
        return new ArrayList<>(pidSet);
    }

    private static void getPath(
            Map<String, String> map, String nodeId, List<String> path) {
        String pid = map.get(nodeId);
        if (!pid.equals("-1")) {
            path.add(pid);
        }
        if (pid.equals("-1")) {
            Lists.reverse(path);
            return;
        }
        getPath(map, pid, path);
    }

    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node("A", "-1"));
        // nodes.add(new Node("B", "-1"));
        nodes.add(new Node("A-1", "A"));
        nodes.add(new Node("A-2", "A"));
        nodes.add(new Node("A-3", "A"));
        nodes.add(new Node("A-2-1", "A-2"));
        nodes.add(new Node("A-2-2", "A-2"));
        nodes.add(new Node("A-2-3", "A-2"));
        nodes.add(new Node("A-2-4", "A-2"));

        List<String> leafNodes = getLeafNodes(nodes);
        Map<String, String> map = new HashMap<>();
        for (Node node : nodes) {
            map.put(node.ID, node.PID);
        }

        for (String nodeId : leafNodes) {
            List<String> path = new ArrayList<>();
            path.add(nodeId);
            getPath(map, nodeId, path);
            System.out.println(path);
        }
    }
}

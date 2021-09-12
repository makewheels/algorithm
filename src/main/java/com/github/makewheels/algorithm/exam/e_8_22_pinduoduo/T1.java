package com.github.makewheels.algorithm.exam.e_8_22_pinduoduo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class T1 {
    public static class Node implements Comparable<Node>{
        public int s, t;
        @Override
        public int compareTo(Node o) {
            return t - o.t;
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0){
            t--;
            int n = sc.nextInt();
            ArrayList<Node> nodes = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Node node = new Node();
                node.s = sc.nextInt();
                node.t = sc.nextInt();
                nodes.add(node);
            }
            Collections.sort(nodes);
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            for (int i = 0; i < n; i++){
                priorityQueue.add(nodes.get(i).s);
                if (nodes.get(i).t < priorityQueue.size()){
                    priorityQueue.poll();
                }
            }
            long sum = 0;
            while (priorityQueue.size() != 0){
                sum += priorityQueue.poll();
            }
            System.out.println(sum);
        }
    }
}

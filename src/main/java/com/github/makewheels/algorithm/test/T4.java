package com.github.makewheels.algorithm.test;

import java.util.Scanner;

public class T4 {
    public static Node []nodes = new Node[444444];
    public static class Node{
        public long val;
        public long lazy;
    }
    public static void pushup(int x){
        nodes[x].val = Math.max(nodes[x*2+1].val, nodes[x*2].val);
    }
    public static void pushdown(int x, long l, long m, long r){
        if (nodes[x].lazy != 0){
            nodes[x*2].lazy += nodes[x].lazy;
            nodes[x*2+1].lazy += nodes[x].lazy;
            nodes[x*2].val += nodes[x].lazy ;
            nodes[x*2+1].val += nodes[x].lazy ;
            nodes[x].lazy = 0;
        }
    }
    public static void update(int root, long l, long r, long L, long R, long val){
        if(l > R || r < L){
            return;
        }
//        System.out.println(L  + " " + R);
        if (L <= l && r <= R){
//            System.out.println(nodes[root].val);
//            System.out.println(val);
            nodes[root].val += val;
            nodes[root].lazy += val;
            return;
        }
        long m = (l + r) / 2;
        pushdown(root, l, m, r);
        update(root*2, l, m, L, R, val);
        update(root*2+1, m+1, r, L, R, val);
        pushup(root);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < 444444; i++){
            nodes[i] = new Node();
        }
        for (int i = 0; i < t; i++) {
            int N;
            long K, D, Q;
            N = sc.nextInt();
            K = sc.nextInt();
            D = sc.nextInt();
            Q = sc.nextInt();
            for (int j = 1; j <= 4*N; j++) {
                nodes[j].lazy = 0;
                nodes[j].val = -1000000000L * 100010;
            }
            int flag = -1;
            for (int j = 0; j < K; j++) {
                int val = sc.nextInt();
                int pos = sc.nextInt();
                pos++;
                update(1, 1, N, pos, pos, 1000000000L * 100010);
                long l = Math.max(1, pos - D);
                long r = Math.min(N, pos + D);
                update(1,1,N,l,r,val);
//                System.out.println(nodes[1].val+"@@@");
                if (nodes[1].val >= Q){
                    flag = j;
                    break;
                }
            }
            System.out.println(flag);
        }
    }
}

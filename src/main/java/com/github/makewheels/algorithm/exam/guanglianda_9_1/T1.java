package com.github.makewheels.algorithm.exam.guanglianda_9_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 小明最喜欢吃小熊饼干了。有一天，他买了一大袋混合口味的小熊饼干，每一块小熊饼干的口味用一个正整数a表示。这一大袋饼干一共有n块，他把这n块饼干依次排成一长列，从左到右依次编号为第1块饼干、第2块饼干、······、第n块饼干。于是饼干的口味就组成了一个序列a1、a2、······、an 。这时小明的妈妈想考考小明，就给出了m个数字b1、b2、......、bm(1≤bi≤n) 。对于每一个数字bi（1≤i≤m）, 妈妈想让小明数出从第bi块饼干到第n块饼干中，一共有几种不同的口味。小明只想吃饼干，回答不上妈妈的问题，你能帮帮小明吗？
 * <p>
 * <p>
 * <p>
 * 输入描述
 * 第一行有两个整数n、m，分别表示饼干的个数、妈妈给出的数字的个数；
 * <p>
 * 第二行有n个整数a1、a2、······、an ，表示n块饼干的口味；
 * <p>
 * 接下来有m行，第i行有一个整数bi(1≤bi≤n)  ，表示妈妈给出的某一个数。
 * <p>
 * 1≤n,m≤100000,1≤ai≤100000;
 * <p>
 * 输出描述
 * 你的输出一共有m行，每行一个整数，第i行的整数表示从第bi块饼干到第n块饼干中，一共有几种不同的口味。
 * <p>
 * <p>
 * 样例输入
 * 5 3
 * 8 4 5 2 4
 * 1
 * 2
 * 3
 * 样例输出
 * 4
 * 3
 * 3
 * <p>
 * 提示
 * 第1到第5块饼干中有4种不同的口味，输出4；
 * <p>
 * 第2到第5块饼干中有4种不同的口味，输出3；
 * <p>
 * 第3到第5块饼干中有4种不同的口味，输出3；
 */
public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int lines = scanner.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < lines; i++) {
            int start = scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int j = start - 1; j < arr.length; j++) {
                set.add(arr[j]);
            }
            System.out.println(set.size());
        }
    }
}

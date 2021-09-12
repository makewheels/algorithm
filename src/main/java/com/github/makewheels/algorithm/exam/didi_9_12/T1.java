package com.github.makewheels.algorithm.exam.didi_9_12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对战卡
 * 时间限制： 3000MS
 * 内存限制： 655360KB
 * 题目描述：
 * 小明最近迷上了一款基于对战卡的游戏，该游戏的规则如下：
 * <p>
 * 每位玩家都拥有N张对战卡和一张可以摆放M张卡片的对战图。
 * 每一张对战卡上都标有一个正整数用于表示该卡片上角色的攻击值，不同的对战卡其攻击值不一定相等。
 * <p>
 * 玩家可以从N张对战卡中选取若干张摆放到对战图上，在对战图上一共有M个可以摆放的位置。
 * 然后计算对战图的攻击值，即摆放在一张对战图上的所有对战卡的攻击值之和。
 * 小明希望能够快速得到一张攻击值最大的对战图，你能否编写一个程序帮帮他？
 * <p>
 * <p>
 * <p>
 * 输入描述
 * 单组输入，每组包含两行。
 * <p>
 * 第1行两个空格隔开的正整数N和M，N为拥有的对战卡数量，M为对战图上可以摆放的对战卡数量。
 * （1< N<=10^5且1<M<=10^5）
 * <p>
 * 第2行包含N个正整数，分别表示N张对战卡的攻击值，两两之间用空格隔开。
 * <p>
 * 输出描述
 * 输出小明的对战图能够具有的最大攻击值。
 * <p>
 * <p>
 * 样例输入
 * 6 3
 * 5 2 10 4 6 5
 * 样例输出
 * 21
 */
public class T1 {
    public static void main(String[] args) {
        //2021年9月12日18:37:31
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += arr[arr.length - 1 - i];
        }
        System.out.println(sum);
    }
}

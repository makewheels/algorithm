package com.github.makewheels.algorithm.exam.e_9_18_vmware;

import java.util.Scanner;

/**
 * 含1素数
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 小明喜欢素数，他的幸运数字是1。因此，他特别特别喜欢包含数字1的素数，
 * 例如11、13、17、19、31等含1素数。 你能否编写一个程序，
 * 帮助小明计算出正整数N和正整数M之间存在多少个含1素数（包含N和M）？（1<=N<M<=10^6）
 * <p>
 * <p>
 * <p>
 * 输入描述
 * 单组输入。 输入两个正整数N和M（1<=N<M<=10^6）。
 * <p>
 * 输出描述
 * 输出N和M之间含1素数的个数（包含N和M）。
 */
public class T1 {
    private static boolean isSushu(int n) {
        int prime = 2;
        while (prime <= Math.sqrt(n)) {
            if (n % prime == 0) {
                return false;
            } else {
                prime++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isSushu(i) && (i + "").contains("1")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

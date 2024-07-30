package com.github.makewheels.algorithm.interview.qiji_2024_07_30;

public class T1 {
    /*
    实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）。

    示例 1：
    输入：x = 2.00000, n = 10
    输出：1024.00000

    示例 2：
    输入：x = 2.10000, n = 3
    输出：9.26100

    示例 3：
    输入：x = 2.00000, n = -2
    输出：0.25000
    解释：2-2 = 1/22 = 1/4 = 0.25
     */
    public double myPow(double x, int n) {
        double result = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            result *= x;
        }
        if (n < 0) {
            return 1 / result;
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        T1 t1 = new T1();
        System.out.println(t1.myPow(2.00000, 10));
        System.out.println(t1.myPow(2.10000, 3));
        System.out.println(t1.myPow(2.00000, -2));
    }
}

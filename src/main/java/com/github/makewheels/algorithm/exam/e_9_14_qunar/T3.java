package com.github.makewheels.algorithm.exam.e_9_14_qunar;

import java.util.Scanner;

/**
 * 优雅的字符串
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * Lisa 喜欢字符串，尤其是长字符串。对于每个字符串，她都有专门的评价体系来判断字符串的优雅程度。
 * 她定义一个字符串 S[1..3n−2] (n≥2) 是一个半回文当且仅当它满足 S[i]=S[2n−i]=S[2n+i− 2] (1≤i≤n) .
 * 例如dfgfdfg是一个半回文串，而dfgjfdfgj不是。现在，Lisa 生成了一些长字符串。
 * 她请求你帮助找出有多少个半回文子串。
 * <p>
 * <p>
 * <p>
 * 输入描述
 * 第一行为测试用例数
 * <p>
 * 每个测试用例，只有一行包含一个字符串（字符串的长度小于或等于 100000），该字符串仅由小写字母组成。
 * <p>
 * 输出描述
 * 对于每个测试用例，输出一个整数，表示一个半回文子串的数量。
 * <p>
 * <p>
 * 样例输入
 * 1
 * cdcdsdcdscbaabc
 * 样例输出
 * 2
 * <p>
 * 提示
 * 在示例输入中，有两个子字符串，它们是一个半回文字符串，cdcd 和 cdsdcds。
 */
public class T3 {
    static class Solution {
        public int solution(String str) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }

        res = new Solution().solution(_str);
        System.out.println(res);

    }
}

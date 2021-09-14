package com.github.makewheels.algorithm.exam.e_9_14_qunar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 题目一
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 一个正整数的数组 arr，数组满足0 <= arr[i] <= 9，挑出任意个数组成一个最大的数，
 * 并且能被3整除，并以字符串形式返回。
 * <p>
 * <p>
 * <p>
 * 输入描述
 * arr = [3,6,7]
 * <p>
 * 第一行为数组大小
 * <p>
 * 之后各行为数组内元素
 * <p>
 * 输出描述
 * 63
 * <p>
 * <p>
 * 样例输入
 * 3
 * 3
 * 6
 * 7
 * 样例输出
 * 63
 * <p>
 * 提示
 * 不存在时请输出空字符串。
 */
public class T1 {
    static class Solution {
        public int solution(int[] arr) {
            if (arr.length == 1) {
                return arr[0];
            }
            StringBuilder stringBuilder = new StringBuilder(arr.length);
            for (int i : arr) {
                stringBuilder.append(i + ",");
            }
            String[] strings = p(stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString());
            int max = Integer.MIN_VALUE;
            for (String string : strings) {
                if (string.equals("")) {
                    continue;
                }
                int value = Integer.parseInt(string);
                if (value % 3 == 0 && value > max) {
                    max = value;
                }
            }
            return max;
        }

        List<String> list = new ArrayList<>();
        StringBuffer s = new StringBuffer();

        public String[] p(String S) {
            dfs(S, list, s);
            return list.toArray(new String[list.size()]);
        }

        public void dfs(String S, List<String> list, StringBuffer s) {
            list.add(s.toString());
            String[] split = S.split(",");
            for (String s1 : split) {
                if (s.toString().contains(s1)) {
                    continue;
                }
                s.append(s1);
                dfs(S, list, s);
                s.deleteCharAt(s.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _arr_size;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for (int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }

        res = new Solution().solution(_arr);
        System.out.println(res);

    }
}

package com.github.makewheels.algorithm.exam.e_9_14_qunar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目二
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 给定一个整数数组m，逐次选出任意整数，请返回所有对应整数、
 * 对应选出的次数的乘积之和能达到的最大值，可以放弃选择某些元素。
 * 比如数组元素为[a1,a2,a3,a4]，依次选择a3，a2和a4，乘积之后的结果就是a3*1+a2*2+a4*3。
 * <p>
 * <p>
 * <p>
 * 输入描述
 * m = [-1,1,4,-9,-8]
 * <p>
 * 第一行为数组大小
 * <p>
 * 之后各行为数组元素
 * <p>
 * 输出描述
 * 13
 * <p>
 * <p>
 * 样例输入
 * 5
 * -1
 * 1
 * 4
 * -9
 * -8
 * 样例输出
 * 13
 * <p>
 * 提示
 * 解释：不选最后2个，最大的和为 (-1*1 + 1*2 + 4*3 = 13) 。
 */
public class T2 {
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

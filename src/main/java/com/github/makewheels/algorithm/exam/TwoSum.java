package com.github.makewheels.algorithm.exam;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * 两数之和
     * 描述
     * 给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
     * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），
     * 需要满足 index1 小于index2.。注意：下标是从1开始的
     * 假设给出的数组中只存在唯一解
     * 例如：
     * 给出的数组为 {20, 70, 110, 150},目标值为90
     * 输出 index1=1, index2=2
     */
    public static void main(String[] args) {
        int[] arr = {20, 70, 110, 150};
        int target = 90;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                System.out.println("index1 = " + map.get(arr[i]) + ", index2 = " + i);
            } else {
                map.put(target - arr[i], i);
            }
        }
    }
}

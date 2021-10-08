package com.github.makewheels.algorithm.interview.dipingxian_9_29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 4, 1, 4, 3, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int each : arr) {
            map.merge(each, 1, Integer::sum);
        }
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            Integer value = map.get(key);
            if (value == 1) {
                System.out.println(key);
            }
        }
    }
}

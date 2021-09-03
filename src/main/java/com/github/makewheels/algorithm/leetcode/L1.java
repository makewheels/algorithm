package com.github.makewheels.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            } else {
                map.put(target - num, i);
            }
        }
        return null;
    }
}

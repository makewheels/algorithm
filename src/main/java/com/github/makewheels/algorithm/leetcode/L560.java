package com.github.makewheels.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L560 {
    public int subarraySum(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        for (int num : nums) {
            count += map.getOrDefault(num - k, 0);
            map.merge(num, 1, Integer::sum);
        }

        return count;
    }
}

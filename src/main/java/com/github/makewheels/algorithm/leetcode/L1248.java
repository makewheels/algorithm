package com.github.makewheels.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++)   // [1,1,2,1,1]
            nums[i] = nums[i] % 2 == 0 ? 0 : 1; // [1,1,0,1,1]

        for (int i = 1; i < nums.length; i++)
            nums[i] = nums[i] + nums[i - 1];    // [1,2,2,3,4]

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums)
            map.merge(num, 1, Integer::sum);

        for (int num : nums)
            count += map.getOrDefault(num - k, 0);

        return count;
    }
}

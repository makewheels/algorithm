package com.github.makewheels.algorithm.exam.e_9_18_boss;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class T3 {
    public boolean[] isBlackIp(String[] ipArr, String[] blackIpArr) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, blackIpArr);
        boolean[] result = new boolean[ipArr.length];
        for (int i = 0; i < ipArr.length; i++) {
            result[i] = set.contains(ipArr[i]);
        }
        return result;
    }
}

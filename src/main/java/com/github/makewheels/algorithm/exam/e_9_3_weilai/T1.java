package com.github.makewheels.algorithm.exam.e_9_3_weilai;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class T1 {
    private Map<String, Void> map = new ConcurrentHashMap<>();

    private boolean isInList(String ip) {
        return map.containsKey(ip);
    }
}

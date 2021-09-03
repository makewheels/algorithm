package com.github.makewheels.algorithm.exam.weilai_9_3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class T1 {
    private Map<String, Void> map = new ConcurrentHashMap<>();

    private boolean isInList(String ip) {
        return map.containsKey(ip);
    }
}

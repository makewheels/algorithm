package com.github.makewheels.algorithm.test;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

public class TestId {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Snowflake snowflake = IdUtil.getSnowflake();
            long l = snowflake.nextId();
            Thread.sleep(1);
            System.out.println(l);
        }
        for (int i = 0; i < 10; i++) {
            String objectId = IdUtil.objectId();
            System.out.println(objectId);
        }
    }
}

package com.github.makewheels.algorithm.interview.jingdong_10_25;

public class TestSingleton {
    private static TestSingleton instance;

    private TestSingleton() {
    }

    public TestSingleton getInstance() {
        if (instance == null) {
            synchronized (TestSingleton.class) {
                if (instance == null) {
                    instance = new TestSingleton();
                }
            }
        }
        return instance;
    }
}

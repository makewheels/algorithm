package com.github.makewheels.algorithm.interview.xiandou_9_27;

public class TestSinglton {
    private static TestSinglton instance;

    private TestSinglton() {
    }

    public static TestSinglton getInstance() {
        synchronized (TestSinglton.class) {
            if (instance == null) {
                instance = new TestSinglton();
            }
            return instance;
        }
    }
}

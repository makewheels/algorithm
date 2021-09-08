package com.github.makewheels.algorithm.interview.zhuanzhuan_9_8;

class Singleton {

}

public class T1 {
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (T1.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

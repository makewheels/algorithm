package com.github.makewheels.algorithm.interview.jingdong_2024_07_26;

public class T1 {
    static int value = 0;
    static Object lock = new Object();

    static class MyTread extends Thread {
        int threadId;

        @Override
        public void run() {
            synchronized (lock) {
                while (value % 3 != threadId) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(value);
                value++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        MyTread thread1 = new MyTread();
        thread1.threadId = 0;
        thread1.start();
        MyTread thread2 = new MyTread();
        thread2.threadId = 1;
        thread2.start();
        MyTread thread3 = new MyTread();
        thread3.threadId = 2;
        thread3.start();
    }
}

package com.github.makewheels.algorithm.test;

import java.util.ArrayList;
import java.util.List;

public class TestThreads {
    private static volatile int number = 1;

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        final Object lock = new Object();

        for (int i = 1; i <= 3; i++) {
            int finali = i;
            Thread thread = new Thread("thread-" + i) {
                public void run() {
                    synchronized (lock) {
                        for (int j = 0; j < 10; j++) {
                            while (number != finali) {
                                try {
                                    lock.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            System.out.println(Thread.currentThread().getName() + "-" + number);
                            number = (number % 3) + 1;
                            lock.notifyAll();
                        }
                    }
                }
            };
            threads.add(thread);
        }

        for (int i = 0; i < 3; i++) {
            threads.get(i).start();
        }
    }
}

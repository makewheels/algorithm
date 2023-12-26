package com.github.makewheels.algorithm.interview.xtransfer_2023_12_26;

public class ThreadPrint {
    private static int flag = 1;
    private static int number = 1;

    public static void main(String[] args) {
        Object lock = new Object();
        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (flag == 1) {
                        if (number >= 10) {
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + " " + number);
                        number++;
                        flag = 2;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (flag == 2) {
                        if (number >= 10) {
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + " " + number);
                        number++;
                        flag = 1;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }).start();
    }
}

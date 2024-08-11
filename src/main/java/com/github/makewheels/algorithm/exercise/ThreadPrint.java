package com.github.makewheels.algorithm.exercise;

public class ThreadPrint {
    private static int number = 0;
    private static Object lock = new Object();
    private static int max = 10;

    static class MyThread extends Thread {
        private int threadIndex;

        MyThread(int threadIndex) {
            this.threadIndex = threadIndex;
        }

        @Override
        public void run() {
            try {
                while (number <= max) {
                    synchronized (lock) {
                        while (number % 3 != threadIndex) {
                            lock.wait();
                        }
                        if (number <= max) {
                            System.out.println(Thread.currentThread().getName() + ": " + number);
                        }
                        number++;
                        lock.notifyAll();
                    }
                }
            } catch (Exception ignore) {
            }
        }

        public static void main(String[] args) {
            MyThread thread1 = new MyThread(0);
            MyThread thread2 = new MyThread(1);
            MyThread thread3 = new MyThread(2);
            thread1.start();
            thread2.start();
            thread3.start();
        }
    }
}
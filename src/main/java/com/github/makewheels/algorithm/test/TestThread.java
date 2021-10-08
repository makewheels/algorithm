package com.github.makewheels.algorithm.test;

public class TestThread {
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("32d2ewf3");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(1000);
        myThread.start();
    }
}

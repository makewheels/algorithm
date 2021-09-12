package com.github.makewheels.algorithm.exam.iqiyi_9_12;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T4 {
    public static void main(String[] args) throws InterruptedException {
        final Scanner reader = new Scanner(System.in);
        final String next = reader.next();
        String[] orders = next.substring(1, next.length() - 1).split(",");
        FooPrint foo = new FooPrint();
        Thread thread1 = new Thread(() -> {
            try {
                foo.first(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                foo.second(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                foo.third(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        List<Thread> threads = Arrays.asList(thread1, thread2, thread3);
        for (String order : orders) {
            threads.get(Integer.parseInt(order) - 1).start();
        }
        reader.close();
    }
}

class FooPrint {
    Lock lock = new ReentrantLock();
    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();
    Condition conditionC = lock.newCondition();
    int state = 0;

    public FooPrint() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            if (state % 3 != 0) {
                conditionA.await();
            }
            state++;
            printFirst.run();
            conditionB.signal();
        } finally {
            lock.unlock();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        try {
            if (state % 3 != 1) {
                conditionB.await();
            }
            state++;
            printSecond.run();
            conditionC.signal();
        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try {
            if (state % 3 != 2) {
                conditionC.await();
            }
            state++;
            printThird.run();
            conditionA.signal();
        } finally {
            lock.unlock();
        }
    }
}
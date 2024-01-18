package com.github.makewheels.algorithm.interview.haoweilai_24_01_18;

import java.util.Stack;

public class haoweilai {
    private final Stack<Integer> stack = new Stack<>();
    private final Object lock = new Object();

    private void push(int value) {
        synchronized (lock) {
            stack.push(value);
        }
    }

    private int pop() {
        synchronized (lock) {
            return stack.pop();
        }
    }
}

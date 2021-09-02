package com.github.makewheels.algorithm.test;

public class TestExtends {
    class Father {
        void s() {
            System.out.println("father");
        }
    }

    class Son extends Father {
        void s() {
            System.out.println("Son");
        }
    }

    private void run() {
        Son son = new Son();
        son.s();
    }

    public static void main(String[] args) {
        new TestExtends().run();

    }
}

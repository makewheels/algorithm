package com.github.makewheels.algorithm.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(new Integer(1));
        System.out.println(list);
        System.out.println("niubi");
    }
}

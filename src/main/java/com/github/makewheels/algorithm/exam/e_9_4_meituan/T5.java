package com.github.makewheels.algorithm.exam.e_9_4_meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class T5 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(8);
        int index = random.nextInt(list.size());
        System.out.println(list.get(index));
    }
}

package com.github.makewheels.algorithm.exam.e_9_29_zhongguoxitong;

import java.util.*;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replace(" ", "");
        line = line.replace("[", "");
        line = line.replace("]", "");
        String[] split = line.split(",");
        List<Integer> list = new ArrayList<>(split.length);
        for (String s : split) {
            list.add(Integer.parseInt(s));
        }
        list.sort(Comparator.comparingInt(Integer::intValue));
        System.out.println(list);
    }
}

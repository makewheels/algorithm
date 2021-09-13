package com.github.makewheels.algorithm.exam.e_9_13_bilibili;

import java.util.*;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.split(",");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }
        Deque<Integer> queue = new LinkedList<>();
        for (int j : array) {
            queue.offerLast(j);
        }
        List<Integer> list = new ArrayList<>(split.length);
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                list.add(queue.pollLast());
            } else {
                list.add(queue.pollFirst());
            }
        }
        System.out.println(list.toString().replace("[", "")
                .replace("]", "")
                .replace(" ", ""));
    }
}

package com.github.makewheels.algorithm.exam.wuba_9_11;

import java.util.*;

public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.substring(1, line.length() - 1);
        String[] split = line.split(",");
        if (split.length < 5) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
        }
        List<Integer> list = new ArrayList<>();
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > 1) {
                list.add(map.get(key));
            }
        }
        int result = 1;
        for (Integer each : list) {
            result *= each;
        }
        System.out.println(result);
    }
}

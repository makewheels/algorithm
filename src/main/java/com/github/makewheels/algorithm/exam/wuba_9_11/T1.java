package com.github.makewheels.algorithm.exam.wuba_9_11;

import java.util.*;

public class T1 {
    public static int[] find(int[] arg) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : arg) {
            map.merge(i, 1, Integer::sum);
        }
        Set<Integer> keySet = map.keySet();
        List<Integer> list = new ArrayList<>();
        for (Integer integer : keySet) {
            if (map.get(integer) == 1) {
                list.add(integer);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.substring(1, line.length() - 1);
        String[] split = line.split(",");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        int[] result = find(arr);
        System.out.println(Arrays.toString(result).replace(" ", ""));
    }
}

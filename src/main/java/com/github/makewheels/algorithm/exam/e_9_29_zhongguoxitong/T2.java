package com.github.makewheels.algorithm.exam.e_9_29_zhongguoxitong;

import java.util.*;

public class T2 {
    public static int MoreThanHalfNum_Solution(int[] array) {
        System.out.println(Arrays.toString(array));
        Map<Integer, Integer> map = new HashMap<>();
        for (int each : array) {
            map.merge(each, 1, Integer::sum);
        }
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            Integer value = map.get(key);
            if (value > array.length / 2) {
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replace(" ", "");
        line = line.replace("[", "");
        line = line.replace("]", "");
        String[] split = line.split(",");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
}

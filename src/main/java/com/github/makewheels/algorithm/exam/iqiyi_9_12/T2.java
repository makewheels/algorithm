package com.github.makewheels.algorithm.exam.iqiyi_9_12;

import java.util.*;
import java.util.stream.Collectors;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String str = i + "";
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += Integer.parseInt(str.charAt(j) + "");
            }
            map.merge(sum, 1, Integer::sum);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (Integer each : list) {
            if (each != 1) {
                resultMap.merge(each, 1, Integer::sum);
            }
        }
        List<Integer> resultList = resultMap.values().stream().sorted().collect(Collectors.toList());
        System.out.println(resultList.get(resultList.size() - 1));
    }
}

package com.github.makewheels.algorithm.exam.e_9_26_tencent;

import java.util.*;

public class T1 {
    private static List<Integer> getYinshu(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    private static int getMinJiange(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                min = list.get(i);
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < T; i++) {
//            if (map.get(i) != null) {
//                System.out.println(map.get(i));
//                continue;
//            }
            int x = scanner.nextInt();
            for (int j = 1; ; j++) {
                List<Integer> yinshu = getYinshu(j);
//                System.out.println(yinshu);
                if (yinshu.size() <= 3) {
                    continue;
                }
//                System.out.println("yinshu = " + yinshu);
                int minJiange = getMinJiange(yinshu);
                if (minJiange == x) {
                    map.put(minJiange, j);
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}

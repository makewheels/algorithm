package com.github.makewheels.algorithm.exam.e_10_28_minsheng;

import java.util.*;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> map = new LinkedHashMap<>();
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            String user = split[0];
            String game = split[1];
            List<String> list = map.get(user);
            if (list == null) {
                List<String> insert = new ArrayList<>();
                insert.add(game);
                map.put(user, insert);
            } else {
                list.add(game);
            }
        }
        for (String key : map.keySet()) {
            System.out.print(key + " ");
            List<String> list = map.get(key);
            for (String game : list) {
                System.out.print(game + " ");
            }
            System.out.println();
        }
    }
}

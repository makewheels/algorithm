package com.github.makewheels.algorithm.exam.aibee_8_28;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String[] s1 = line1.split(";");
        String[] s2 = line2.split(";");
        Map<String, String> map1 = new LinkedHashMap<>();
        for (String s : s1) {
            String[] split = s.split(",");
            map1.put(split[0].trim(), split[1]);
        }
        Map<String, String> map2 = new HashMap<>();
        for (String s : s2) {
            String[] split = s.split(",");
            map2.put(split[0].trim(), split[1]);
        }
        for (String str : map1.keySet()) {
            System.out.println(str + ",['" + map2.get(map1.get(str)) + "']");
        }
    }
}

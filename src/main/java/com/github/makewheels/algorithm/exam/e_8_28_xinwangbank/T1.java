package com.github.makewheels.algorithm.exam.e_8_28_xinwangbank;

import java.util.*;

class Solution {
    public String[] delMinFrequencyChar(String[] input) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            String str = input[i];
            char[] chars = str.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : chars) {
                Integer integer = map.get(c);
                if (integer == null || integer == 0) {
                    map.put(c, 1);
                } else {
                    map.put(c, integer + 1);
                }
            }
            int minTimes = Integer.MAX_VALUE;
            for (Character key : map.keySet()) {
                if (map.get(key) < minTimes) {
                    minTimes = map.get(key);
                }
            }
            List<Character> characters = new ArrayList<>();
            for (Character key : map.keySet()) {
                if (map.get(key) == minTimes) {
                    characters.add(key);
                }
            }
            StringBuilder stringBuilder = new StringBuilder(str.length());
            for (char c : chars) {
                if (!characters.contains(c)) {
                    stringBuilder.append(c);
                }
            }
            result[i] = stringBuilder.toString();
        }
        return result;
    }
}

public class T1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] res;

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for (int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }

        res = new Solution().delMinFrequencyChar(_input);
        for (String re : res) {
            System.out.println(re);
        }

    }
}

package com.github.makewheels.algorithm.exam.e_9_13_bilibili;

import java.util.Scanner;

public class T2 {
    static class Solution {
        /* Write Code Here */
        public int strstr(String a, String b) {
            return a.indexOf(b);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String _a;
        try {
            _a = in.nextLine();
        } catch (Exception e) {
            _a = null;
        }

        String _b;
        try {
            _b = in.nextLine();
        } catch (Exception e) {
            _b = null;
        }

        res = new Solution().strstr(_a, _b);
        System.out.println(res);

    }

}

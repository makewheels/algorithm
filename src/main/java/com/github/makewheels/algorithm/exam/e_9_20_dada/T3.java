package com.github.makewheels.algorithm.exam.e_9_20_dada;

public class T3 {
    public boolean checkRecord(String s) {
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                countA++;
            }
        }
        if (countA >= 2) {
            return false;
        }
        return !s.contains("LLL");
    }
}

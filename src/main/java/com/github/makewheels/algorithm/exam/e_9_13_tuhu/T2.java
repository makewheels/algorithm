package com.github.makewheels.algorithm.exam.e_9_13_tuhu;

public class T2 {
    public int countTiger(int month) {
        if (month == 1) {
            return 2;
        } else if (month == 2) {
            return 2;
        } else {
            return countTiger(month - 1) + countTiger(month - 2);
        }
    }
}

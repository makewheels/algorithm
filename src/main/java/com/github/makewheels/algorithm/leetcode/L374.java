package com.github.makewheels.algorithm.leetcode;

public class L374 {
    public int guess(int num) {
        return 0;
    }

    public int guessNumber(int n) {
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = (int) (((long) left + right) / 2);
            int guess = guess(mid);
            if (guess == 0) {
                return mid;
            } else if (guess == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

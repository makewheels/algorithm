package com.github.makewheels.algorithm.interview.futu_9_16;

public class T1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] direction = {
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };
        int row = 0;
        int column = 0;
        boolean[][] visitRecord = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length * matrix[0].length; i++) {
            System.out.print(matrix[row][column] + ", ");
            visitRecord[row][column] = true;

        }
    }
}

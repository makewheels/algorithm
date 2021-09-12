package com.github.makewheels.algorithm.exam.e_8_28_xinwangbank;

import java.util.Scanner;

class T2Solution {
    public int[] circlePrint(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];
        int total = rows * columns;
        int[] order = new int[total];
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            order[i] = matrix[row][column];
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0],
                    nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0
                    || nextColumn >= columns || visited[nextRow][nextColumn]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return order;
    }
}

public class T2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] res;

        int _input_rows = Integer.parseInt(in.nextLine().trim());
        int _input_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _input = new int[_input_rows][_input_cols];
        for (int _input_i = 0; _input_i < _input_rows; _input_i++) {
            for (int _input_j = 0; _input_j < _input_cols; _input_j++) {
                _input[_input_i][_input_j] = in.nextInt();

            }
        }

        if (in.hasNextLine()) {
            in.nextLine();
        }

        res = new T2Solution().circlePrint(_input);
        for (int re : res) {
            System.out.println(re);
        }

    }
}

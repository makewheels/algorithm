package com.github.makewheels.algorithm.basic.sort;

public class SelectSort {
    private static int findMinIndex(int[] array, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] array = SortUtil.getArray();
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = findMinIndex(array, i);
            if (array[i] > array[minIndex]) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        SortUtil.print(array);
    }
}

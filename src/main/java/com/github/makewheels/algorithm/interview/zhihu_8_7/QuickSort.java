package com.github.makewheels.algorithm.interview.zhihu_8_7;

public class QuickSort {
    public static void main(String[] args) {
    }

    private void quickSort(int[] arr, int left, int right) {
        int p = partation(arr, 0, arr.length - 1);
        quickSort(arr, 0, p - 1);
        quickSort(arr, p + 1, arr.length - 1);
    }

    private int partation(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (arr[left] < pivot)
                left++;
            while (arr[right] > pivot)
                right--;
            swap(arr, left, right);
        }
        arr[left] = pivot;
        return left;
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

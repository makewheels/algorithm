package com.github.makewheels.algorithm.interview.tencent_chongqing_9_3;

public class T2 {
    private int find(int[] arr, int k) {
        return quickSort(arr, 0, arr.length - 1, arr.length - k);
    }

    private int quickSort(int[] arr, int left, int right, int k) {
        int pivotIndex = partition(arr, left, right);
        if (pivotIndex == k) {
            return pivotIndex;
        } else {
            if (pivotIndex < k) {
                return quickSort(arr, pivotIndex + 1, right, k);
            } else {
                return quickSort(arr, left, pivotIndex - 1, k);
            }
        }
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5, 7, 11, 9, 14, 6, 10};
        int index = new T2().find(arr, 2);
        System.out.println(arr[index]);
    }
}

package com.github.makewheels.algorithm.interview.zhuanzhuan_9_8;

public class T2 {
    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 10, 13, 17};
        int result = new T2().binarySearch(arr, 5);
        System.out.println(result);
    }

}

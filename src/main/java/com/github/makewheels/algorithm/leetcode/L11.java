package com.github.makewheels.algorithm.leetcode;

public class L11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int maxLeft = left;
        int maxRight = right;
        while (left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int distance = right - left;
            int area = currentHeight * distance;
            if (area > maxArea) {
                maxArea = area;
                maxLeft = left;
                maxRight = right;
            }
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        int currentHeight = Math.min(height[maxLeft], height[maxRight]);
        int distance = maxRight - maxLeft;
        return currentHeight * distance;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new L11().maxArea(arr));
    }
}

package com.searchalgorithm.problems;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int target = 5;
        int data[] = {12, 10, 9, 8, 7, 1, 2, 3, 5, 6};
        int min = findMinValue(data);
        search(data, min, target);
    }

    public static int findMinValue(int[] arr) {
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    public static void search(int[] arr, int min, int target) {
        if (target > arr[min - 1]) {
            int low = 0;
            int high = min - 1;
            int result = searchDescendingOrder(low, high, arr, target);
            System.out.println(result);
        } else {
            int low = min;
            int high = arr.length - 1;
            int result = searchAscendingOrder(low, high, arr, target);
            System.out.println(result);
        }
    }

    public static int searchDescendingOrder(int low, int high, int[] arr, int target) {
        if (low <= high) {
            int median = low + (high - low) / 2;
            if (target > arr[median]) {
                return searchDescendingOrder(low, median - 1, arr, target);
            }
            if (target < arr[median]) {
                return searchDescendingOrder(median + 1, high, arr, target);
            }
            if (target == arr[median]) {
                return median;
            }
        }
        return -1;
    }

    public static int searchAscendingOrder(int low, int high, int[] arr, int target) {
        if (low <= high) {
            int median = low + (high - low) / 2;
            if (target < arr[median]) {
                return searchAscendingOrder(low, median - 1, arr, target);
            }
            if (target > arr[median]) {
                return searchAscendingOrder(median + 1, high, arr, target);
            }
            if (target == arr[median]) {
                return median;
            }
        }
        return -1;
    }
}
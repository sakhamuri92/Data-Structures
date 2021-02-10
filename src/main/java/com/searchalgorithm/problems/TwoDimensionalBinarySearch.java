package com.searchalgorithm.problems;

public class TwoDimensionalBinarySearch {


    public static void main(String[] args) {

        int arr[][] = {{6, 7, 8}, {9, 10, 11}, {12, 13, 14}};

        int target = 12;

        Object result = search(arr, target);

        System.out.println(result);

    }


    public static Object search(int[][] arr, int target) {

        int i = 0, j = arr.length - 1;

        while (i <= arr.length - 1 && j >= 0) {

            if (arr[i][j] == target) {

                String result = i + "," + j;

                return result;

            } else if (target > arr[i][j]) {

                i++;

            } else {

                j--;

            }

        }

        return -1;

    }


}
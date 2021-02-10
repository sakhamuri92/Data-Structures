package com.searchalgorithm.problems;

public class Fibonacci {

    public static void main(String[] args) {
        int n=10;
        int[] nums = new int[n+2];
        nums[0] = 0;
        nums[1] = 1;
        for(int i=2;i<=n;i++){
                int curr = nums[i-1];
                int previous = nums[i-2];
                nums[i] = curr+previous;
        }
        for (int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
    }
}

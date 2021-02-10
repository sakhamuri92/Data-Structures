package com.searchalgorithm.problems;

public class ZerosOnesTwosArrangement {
    public static void main(String[] args) {
        int[] nums = {0,0,1,2,1,2,1,2,0};
        int start=0,end=nums.length-1,index=0;
        while(start < end && index <= end) {
            if(nums[index] == 0){
                nums[index] = nums[start];
                nums[start] = 0;
                index++;
                start++;
            }else if(nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }else {
                index++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}

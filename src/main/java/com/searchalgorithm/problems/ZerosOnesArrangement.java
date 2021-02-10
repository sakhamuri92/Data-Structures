package com.searchalgorithm.problems;

public class ZerosOnesArrangement {
    public int[] arrangeZerosAndOnes(int[] nums){
        int start=0,end=nums.length-1;
        while(start < end) {
            if (nums[start] == 1) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            } else  {
                start++;
            }

        }
        for (int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,1,0,1,0,0,1};
        ZerosOnesArrangement z = new ZerosOnesArrangement();
        z.arrangeZerosAndOnes(nums);
    }
//    public static void main(String[] args) {
//        int nums[] = {0,1,0,1,0,0,1};
//        int start=0,end=nums.length-1;
//        while(start < end) {
//            while(nums[start]  == 0 && start < end){
//                start++;
//            }
//
//            while(nums[end] == 1 && start < end){
//                end--;
//            }
//            if(start<end) {
//                nums[start] = 0;
//                nums[end] = 1;
//                start++;
//                end--;
//            }
//        }
//        for (int i=0;i<nums.length;i++) {
//            System.out.println(nums[i]);
//        }
//    }
}

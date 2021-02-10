package com.searchalgorithm.problems;

//Given sorted array and a target value, return the index if the target is found if not return the index where it would be inserted
public class SearchInsertPosition {
    public int searchInsertPosition(int []nums,int target){
        int start=0,end=nums.length-1;

        while(start<= end) {
            int midpoint = start+(end-start)/2;
            if(nums[midpoint] == target){
                return midpoint;
            } else if(target < nums[midpoint]){
                end = midpoint-1;
            } else if(target > nums[midpoint]){
                start = midpoint+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7};
        int target = 8;
        SearchInsertPosition s = new SearchInsertPosition();
        System.out.println(s.searchInsertPosition(nums,target));
    }
}

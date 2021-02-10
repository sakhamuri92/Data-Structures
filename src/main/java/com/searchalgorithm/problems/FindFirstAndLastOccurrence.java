package com.searchalgorithm.problems;

public class FindFirstAndLastOccurrence {
    public int[] firstAndLastOccurrence(int[] nums,int target){
        int result[] = new int[2];
        result[0] = findStartingIndex(nums,target);
        result[1] = findEndingIndex(nums,target);

        System.out.println(result[0]);
        System.out.println(result[1]);
        return result;
    }
    public int findStartingIndex(int[] nums,int target){
        int index = -1;
        int start = 0,end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(target <= nums[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
            if(target == nums[mid]) index = mid;
        }
        return index;
    }
    public int findEndingIndex(int[] nums,int target){
        int index = -1;
        int start = 0,end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start/2);

            if(target >= nums[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
            if(target == nums[mid]) index = mid;
        }
        return index;
    }
    public static void main(String[] args) {
    int nums[] = {2,3,3,3,3};
        FindFirstAndLastOccurrence f = new FindFirstAndLastOccurrence();
        System.out.println(f.firstAndLastOccurrence(nums,3));
    }
}

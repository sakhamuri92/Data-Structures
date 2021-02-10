package com.searchalgorithm.problems;

public class DistinctElementInArray {
    public int returnDistinctElement(int arr[]){
        int low=0,high=arr.length-1;
        while(low < high) {
            int mid = low+(high-low)/2;
            int diff = high - mid;
            if(arr[mid] == arr[mid-1]){
                if(diff % 2 == 0){
                    high = mid-2;
                }else {
                    low = mid+1;
                }
            }else if(arr[mid] == arr[mid+1]){
                if(diff % 2 == 0){
                    low = mid+2;
                }else {
                    high = mid-1;
                }
            }else {
                return arr[mid];
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
    int input[] = {1,1,2,2,3,4,4,8,8};
    DistinctElementInArray a = new DistinctElementInArray();
        System.out.println(a.returnDistinctElement(input));
    }
}

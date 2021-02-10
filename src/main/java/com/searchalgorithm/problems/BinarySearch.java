package com.searchalgorithm.problems;

public class BinarySearch {
    public int searchElement(int arr[],int n){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(n == arr[mid]){
                System.out.println("found");
                return arr[mid];
            }
            if(n<arr[mid]){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
           BinarySearch b = new BinarySearch();
           int a[] = {1,2,3,15,34,78,95};
        System.out.println(b.searchElement(a,95));
    }
}

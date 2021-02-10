package com.searchalgorithm.problems;

public class MinimumElementInRotatedArray {
    public static int returnMinimumElement(){
        int a[] = {11,12,0,1,2,3,4};
        int n = 4;
        int low = 0,high= a.length-1;
        while(low <= high) {
            int mid = low+(high-low)/2;
            int next = (mid + 1)%n;
            int prev = (mid + n-1)%n;
            if(a[low] == a[high]){
                return a[low];
            } else if(a[mid] <= a[next] && a[mid] <= a[prev]){
                return a[mid];
            } else if(a[mid]<= a[high]){
                high = mid-1;
            } else if(a[mid] >= a[low]) {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Minimum element in sorted rotated array: "+ returnMinimumElement());
    }
}

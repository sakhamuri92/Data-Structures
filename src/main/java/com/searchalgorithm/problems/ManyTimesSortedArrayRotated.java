package com.searchalgorithm.problems;

public class ManyTimesSortedArrayRotated {
    // here the number of rotations would be number of elements before the smallest element index; so if we return smallest element index then that is number of rotations
   // No of rotations ==  index of minimum element
    public static int returnMinimumIndex(){
        int a[] = {11,12,1,2,3,4};
        int n = 4;
        int low = 0,high= a.length-1;
        while(low <= high) {
            int mid = low+(high-low)/2;
//            int next = (mid + 1)%n;
//            int prev = (mid + n-1)%n;
            if(a[low] == a[high]){
                 
            } else if(a[mid] <= a[mid+1] && a[mid] <= a[mid-1]){
                return mid;
            } else if(a[mid]<= a[high]){
                high = mid-1;
            } else if(a[mid] >= a[low]) {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        System.out.println("fibnal"+returnMinimumIndex());
    }
}

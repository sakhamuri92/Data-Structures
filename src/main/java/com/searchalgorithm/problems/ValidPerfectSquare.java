package com.searchalgorithm.problems;

public class ValidPerfectSquare {
    public boolean validPerfectSquare(int target){
        int low = 0, high=10000;
        while(low<=high) {
            int mid = low+(high-low)/2;
            int sqroot = mid*mid;
            if(sqroot == target) {
                return true;
            } else if(sqroot > target) {
                high = mid - 1;
            }else {
                low = mid - +1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
    ValidPerfectSquare v = new ValidPerfectSquare();
        System.out.println(v.validPerfectSquare(25));
    }
}

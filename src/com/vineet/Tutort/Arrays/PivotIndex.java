package com.vineet.Tutort.Arrays;

public class PivotIndex {

    public static void main(String[] args) {

        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {

        int totalSum =0;
        int leftSum =0;
        for(int i=0 ; i<nums.length; i++){
            totalSum += nums[i];
        }

        for(int i=0;i<nums.length;i++){
            totalSum = totalSum - nums[i]; // here we are calculating the right sum.

            if(leftSum == totalSum){
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
}

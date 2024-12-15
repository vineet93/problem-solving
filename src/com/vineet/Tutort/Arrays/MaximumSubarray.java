package com.vineet.Tutort.Arrays;

public class MaximumSubarray {

    public static void main(String[] args) {
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
       int[] nums1 = {5,4,-1,7,8};
        System.out.println("Maximum Sum in Sub Array : "+maxSubArray(nums));
        System.out.println("Maximum Sum in Sub Array Optimised is : "+maxSubArrayOptimised(nums1));
    }

    public static int maxSubArray(int[] nums) {  // Brute Force Approach.

        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    // KADANE Algo approach.

    //            (1) Start Traversing your array
    //            (2) For Each Element -> Keep: currSum and prevSum
    //            (3) Find Max of All sum

    public static int maxSubArrayOptimised(int[] nums) {  // KADANE Algo approach.
            int currSum = 0;
            int maxSum =Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){

                currSum += nums[i];
                maxSum = Math.max(currSum,maxSum);

                if(currSum<0){
                    currSum=0;
                }
            }
            return maxSum;
    }
}

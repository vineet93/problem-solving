package com.vineet.Tutort.grokking.slidingwindow;

import java.util.*;

public class MaxSubArrayofSumK {
    public static void main(String[] args) {

        // 1.) Approach to Calculate SubArray of length K everytime.
        int[] nums= { 2, 1, 5, 1, 3, 2 };
        int k=3;
        System.out.println("Brute Force Approach "+findMaxSumSubArray(k,nums));

        // 2.) Approach to Calculate SubArray of length K using Sliding Window by using previous sum.
        int[] nums1= { 2, 1, 5, 1, 3, 2 };
        int k1=3;
        System.out.println("Sliding Window Approach "+findMaxSumSubArraySlidingWindow(k1,nums1));

        // 3.) Problem to calculate SubArray sum of length K having distinct elements.
        // https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/
        int[] nums2= { 1,5,4,2,9,9,9 };
        int k2=3;
        System.out.println("Sum of SubArray of Length "+ k+" having distinct elements :" + findMaxSumSubArrayDistinct(k2,nums2));
    }
    public static int findMaxSumSubArray(int k, int[] arr) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-k;i++){
            currSum=0;
            for(int j=i;j<arr.length+i-k;j++){
                currSum +=arr[j];
            }
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }

    public static int findMaxSumSubArraySlidingWindow(int k, int[] arr) {
        int windowSum=0;
        int windowStart=0;
        int maxSum=Integer.MIN_VALUE;

        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum +=arr[windowEnd];

            if(windowEnd >= k-1){
                maxSum=Math.max(maxSum,windowSum);
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }



    public static long findMaxSumSubArrayDistinct(int k, int[] nums) {
        long sum = 0, max = 0;
        int n  = nums.length;

        Map<Integer,Integer> map = new HashMap();
        if(n == 1)
            return nums[0];

        for(int i=0; i<n; i++){

            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            sum += nums[i];

            if(i>=k){
                map.put(nums[i-k],map.get(nums[i-k]) - 1);
                sum -= nums[i-k];

                if(map.get(nums[i-k]) == 0)
                    map.remove(nums[i-k]);
            }

            if(map.size() == k)
                max = Math.max(sum,max);
        }
        return max;
    }
}

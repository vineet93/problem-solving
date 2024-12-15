package com.vineet.Tutort.grokking.slidingwindow;

import java.util.Arrays;

public class SlidingWindowMax {

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int[] arr = new int[nums.length-k+1];

        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-k+1;i++){
            max=nums[i];
            for(int j=i;j<i+k;j++){
                max = Math.max(nums[j],max);
                arr[i]=max;
            }
        }
        return arr;
    }
}

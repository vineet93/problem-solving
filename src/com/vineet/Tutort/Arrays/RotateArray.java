package com.vineet.Tutort.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
public class RotateArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 24;

        rotate(nums,k);
    }

    public static void rotate(int[] nums, int k) {

        k %= nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

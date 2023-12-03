package com.vineet.Tutort.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2,2,3,4,5,5};
        int k = removeDuplicates(arr);
        System.out.println("Distinct Element : " + k);


    }

    public static int removeDuplicates(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[index+1] = nums[i];
                index++;
            }
        }
        System.out.println("Elements are "+ Arrays.toString(nums));
            return index+1;
    }
}

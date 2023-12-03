package com.vineet.Tutort.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicates2 {
    public static void main(String[] args) {

        int[] arr = {0,0,1,1,1,1,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("unique element appears at most twice are : "+ k);

    }

    public static int removeDuplicates(int[] nums) {


        int i =0;
        // int ele= nums[0];
        for(int ele : nums)
        {
            if(i==0 || i==1 || nums[i-2] != ele)
            {
                nums[i] = ele;
                i++;
            }
        }
        System.out.println("Elements are "+ Arrays.toString(nums));
        return i ;
    }
}

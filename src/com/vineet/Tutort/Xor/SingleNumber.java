package com.vineet.Tutort.Xor;

public class SingleNumber {

    public static void main(String[] args) {
       int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ele=nums[0];
        if(nums.length == 1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            ele = ele^nums[i];
        }
        return ele;
    }
}

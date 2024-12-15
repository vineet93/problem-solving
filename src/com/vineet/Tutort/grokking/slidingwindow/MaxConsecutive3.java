package com.vineet.Tutort.grokking.slidingwindow;


//https://leetcode.com/problems/max-consecutive-ones-iii/description/
public class MaxConsecutive3 {

    public static void main(String[] args) {

        int[] nums={1,1,1,1,1,0,0,0,1,1,1,0,0};
        int k = 2;
        System.out.println(longestOnes(nums,k));
    }

    public static int longestOnes(int[] nums, int k){

        int i=0,j;
        for(j=0;j<nums.length;j++){

            if(nums[j] == 0){
                k--;
            }

            if(k<0){
                if(nums[i] == 0){
                    k++;
                }
                i++;
            }
        }
        return j-i;
    }
}

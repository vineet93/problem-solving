package com.vineet.Tutort.grokking.slidingwindow;

//https://www.lintcode.com/problem/883/
public class MaxConsecutive2 {
    public static void main(String[] args) {
       int[] nums = {1,0,1,1,0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int i=0,j, k=1;
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

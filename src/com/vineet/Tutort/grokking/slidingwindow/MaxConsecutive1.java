package com.vineet.Tutort.grokking.slidingwindow;

//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutive1 {

    public static void main(String[] args) {

        int[] nums= {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
        System.out.println(findMaxConsecutiveOnesTemplate(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                ans=0;
            }else{
                ans=ans+1;
            }
            if(ans>max)
                max=ans;
        }

        return max;
    }

    public static int findMaxConsecutiveOnesTemplate(int[] nums) {

        int i=0,j, k=0;
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

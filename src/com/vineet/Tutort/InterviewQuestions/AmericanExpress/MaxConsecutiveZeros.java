package com.vineet.Tutort.InterviewQuestions.AmericanExpress;

public class MaxConsecutiveZeros {

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,1,1,0,0,1,0,0,0,0,0,0,1,0,0};
        System.out.println(findConsecutiveZero(nums));
    }

    public static int findConsecutiveZero(int[] nums){

        int count=0;
        int max=0;
        boolean flag = false;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count++;
                continue;
            }
            max= Math.max(count,max);
            count=0;
        }
        return max;
    }
}

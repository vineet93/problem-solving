package com.vineet.Tutort.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeros {
    public static void main(String[] args) {

        int[] nums= {0,1,0,3,12};
        moveZeroes(nums);
        int[] nums1= {0,1,0,3,12};
        moveZeroesOptimised(nums1);
    }

    public static void moveZeroes(int[] nums) {

        for(int i=0;i<nums.length-1;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i] == 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesOptimised(int[] nums) {

                int nonZeroIndex =0;

                for(int i=0; i<nums.length;i++){
                    if(nums[i] != 0){
                        nums[nonZeroIndex] = nums[i];
                        nonZeroIndex++;
                    }
                }

                while(nonZeroIndex<nums.length){
                    nums[nonZeroIndex] = 0;
                    nonZeroIndex++;
                }


        System.out.println(Arrays.toString(nums));
    }
}

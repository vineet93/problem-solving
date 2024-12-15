package com.vineet.Tutort.Arrays;

import java.util.Arrays;

public class DecompressRLE {
    public static void main(String[] args) {
      int[]  nums = {1,1,2,3};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    public static int[] decompressRLElist(int[] nums) {

            int arraySize = 0;
            for(int i=0;i<nums.length;i +=2){
                arraySize += nums[i];
            }

            int[] newArray = new int[arraySize];

            int index =0;

            for(int i=1;i<nums.length;i +=2){
                int freq = nums[i-1];
                while(freq !=0){
                    newArray[index] = nums[i];
                    freq--;
                    index++;
                }
            }

            return newArray;
    }
}

package com.vineet.Tutort.Arrays;

public class JumpGame {

    public static void main(String[] args) {

//        int[] arr1 ={3,2,1,0,4};
//        int[] arr2 ={2,3,1,1,4};
        int[] arr3={1,2,3};

        System.out.println(canJump2(arr3));//false
        System.out.println(canJump2(arr3));//true


    }

    public static boolean canJump(int[] nums) {

        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static boolean canJump2(int[] nums) {
        int destination=nums.length-1; //making the destination as the last index of the array
        for(int i=nums.length-2;i>=0;i--){ //iterating from the second last index
            //if the current index + the value at that index is greater or equal to the destination
            //then just change your destination to the index
            if(i+nums[i]>=destination){
                destination=i;
            }
        }
        //if the final index reaches 0 that means we reached end of the array thus function return true
        return destination==0;
    }
}



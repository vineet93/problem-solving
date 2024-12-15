package com.vineet.Tutort.Xor;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums={1,0,3};
        System.out.println(missingNumberUsingXor(nums));

        int[] nums1={1,0,3};
        System.out.println(missingNumber(nums1));
    }

    public static int missingNumberUsingXor(int[] nums) { // Solution using Sum and Formula.
        int ans=0;int i=0;
        for(i=0;i<nums.length;i++){
            ans = ans^i^nums[i];
        }
        return ans^i;
    }
    public static int missingNumber(int[] nums) { // Solution using Sum and Formula.
        int size = nums.length;
        int expectedSum = size * (size+1) / 2;  // Sum of N Natural numbers is N*(N+1)/2.
        // Finding total Sum of Numbers till Size of Array.

        int arraySum=0;

        for(int i=0;i<nums.length;i++){

            arraySum +=nums[i];// Finding the Sum of Actual Array.

        }
        return expectedSum-arraySum; // Returning the missing number.
    }
}

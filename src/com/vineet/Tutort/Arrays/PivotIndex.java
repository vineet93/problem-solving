package com.vineet.Tutort.Arrays;

//https://leetcode.com/problems/find-pivot-index/description/
public class PivotIndex {

    public static void main(String[] args) {


        // Approach:

// 1.) Run a loop and Calculate the totalSum by adding all elements in the array.
// 2.) Run a loop and subtract each element  from the total sum which implicitly gives us the right sum of the array,
//     So we don't need to calculate the right sum additionally.
// 3.) Then check if leftSum == TotalSum (After subtraction of element): return index.
// 4.) If Not, Calculate the LeftSum but adding the element to it.

        //Test case 1
        int[] nums={1,7,3,6,5,6};
        System.out.println("Testcase 1: "+pivotIndex(nums));

        //Test case 2
        int[] nums1={2,-1,1};
        System.out.println("Testcase 2: "+pivotIndex(nums1));

        //Test case 3
        int[] nums2={1,2,3};
        System.out.println("Testcase 3: "+pivotIndex(nums2));
    }

    public static int pivotIndex(int[] nums) {

        int totalSum =0;
        int leftSum =0;
        for(int i=0 ; i<nums.length; i++){
            totalSum += nums[i];
        }

        for(int i=0;i<nums.length;i++){
            totalSum = totalSum - nums[i]; // here we are calculating the right sum.

            if(leftSum == totalSum){
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
}

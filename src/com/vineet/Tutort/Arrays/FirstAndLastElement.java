package com.vineet.Tutort.Arrays;


import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastElement {
    public static void main(String[] args) {

       int[]  nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = new int[2];
        res[0] = findFirst(nums,target);
        res[1] = findLast(nums,target);
        System.out.println(Arrays.toString(res));
    }

    public static int findFirst(int[] nums, int target) {

        int index= -1;
        int mid=0;
        int low=0;
        int high=nums.length-1;

        while(low <= high){

            mid = low + (high - low) / 2;

            if(nums[mid] == target){
                index = mid;
                high = mid-1;
            } else if( nums[mid] > target){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return index;
    }

    public static int findLast(int[] nums, int target) {

        int index = -1; // Initialize the index to -1 (not found).
        int low = 0;    // Initialize the low pointer to the start of the array.
        int high = nums.length - 1; // Initialize the high pointer to the end of the array.

        // Perform binary search until low is less than or equal to high.
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate the middle index.

            if (nums[mid] == target) {
                // If the middle element is equal to the target, update the index to the middle,
                // and search in the right half of the array to find the last occurrence.
                index = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                // If the middle element is greater , search in the left half of the array.
                high = mid - 1;
            } else {
                // If the middle element is less , search in the right half of the array.
                low = mid + 1;
            }
        }

        return index;
    }
}

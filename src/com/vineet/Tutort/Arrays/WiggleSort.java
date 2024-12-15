package com.vineet.Tutort.Arrays;

import java.util.Arrays;

public class WiggleSort {

    public static void main(String[] args) {


        int[] nums = {1,2,3,4,5,6};
        int[] nums1 = {1,2,3,4,5,6};
        wiggleSort(nums);
        wiggleSortDiffApproach(nums1);
    }

    public static void wiggleSort(int[] nums) {
        int n = nums.length;

        if(n == 1)
            System.out.println(nums[0]);

        if(n == 2){
            if(nums[0] > nums[1])
                swap(nums,0,1);

            System.out.println(Arrays.toString(nums));
        }

        for(int i=1;i<n-1;i++){
                if(nums[i-1] <= nums[i] && nums[i] >= nums[i+1]){
                    continue;
                }

                if(i%2 == 1) {
                    if (nums[i - 1] > nums[i]) {
                        swap(nums ,i ,i-1);
                    }
                    if (nums[i] < nums[i+1]) {
                        swap(nums,i,i+1);
                    }
                }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void wiggleSortDiffApproach(int[] nums)
    {
        if (nums.length < 2)
            return;

        for (int i=0; i<nums.length-1; i++) {
            // If Index is Even
            if (i % 2 == 0) {
                if (nums[i] > nums[i + 1]) // Even Index Val > Odd Index Value
                {
                    swap(nums, i, i + 1);
                }
            } else // If Index is Odd
            {
                if (nums[i] < nums[i + 1]) // Odd Index Val < Even Index Val
                {
                    swap(nums, i, i + 1);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }


    public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}

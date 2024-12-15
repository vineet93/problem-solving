package com.vineet.Tutort.Arrays;

public class MaximumProductSubArray {
    public static void main(String[] args) {

        int[] nums={-2,0,-1};
        System.out.println(maxProduct(nums));
        int[] nums1={2,3,-2,-5,6,-1,4};
        System.out.println(maxProductUsingPrefix(nums1));
    }

    public static int maxProduct(int[] nums) { /* Brute Force approach. Finding All sub array and
                                                  calculating the maximum product.
                                                  TC: O(N^2) SC: O(1)*/

        int currPro;
        int maxPro=0;
        for(int i=0;i<nums.length;i++){
            currPro=1;
            for(int j=i;j<nums.length;j++) {
                currPro *= nums[j];

                if (currPro > maxPro)
                    maxPro = currPro;
            }
        }

        return maxPro;
    }

    public static int maxProductUsingPrefix(int[] nums) {

       int currProduct=1;
       int maxProduct=0;

       for(int i=0;i<nums.length;i++){
           currProduct *= nums[i];

           maxProduct=Math.max(currProduct,maxProduct);

           if(currProduct==0)
               currProduct=1;
       }

       currProduct=1;
        for(int i=nums.length-1;i>0;i--){
            currProduct *= nums[i];

            maxProduct=Math.max(currProduct,maxProduct);

            if(currProduct==0)
                currProduct=1;
        }


       return maxProduct;
    }
}

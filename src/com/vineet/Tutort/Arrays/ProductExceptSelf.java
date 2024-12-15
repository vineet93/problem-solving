package com.vineet.Tutort.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=top-interview-150
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf(nums);
        System.out.println(Arrays.toString(res));

    }

    public static int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0;

        // Prefix Product
        int prefixProd = 1;
        for (i=0; i<n; i++)
        {
            if (i>0)
                prefixProd *= nums[i-1];

            res[i] = prefixProd;
        }


        // Suffix Product
        int suffixProd = 1;
        for (i= n-1; i>=0; i--)
        {
            if (i < n-1)
                suffixProd *= nums[i+1];

            // res[i] = prefix[i] * suffix[i]
            res[i] *= suffixProd;
        }

        return res;
    }
}

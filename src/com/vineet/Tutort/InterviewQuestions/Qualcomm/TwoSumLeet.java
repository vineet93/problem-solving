package com.vineet.Tutort.InterviewQuestions.Qualcomm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumLeet {

    public static void main(String[] args) {
       int[] nums = {3,2,3} ;
        int target = 6;

        int[] val = findIndex(nums,target);

        System.out.println("Brute Force Solution "+ Arrays.toString(val));

        System.out.println("Optimised Solution "+Arrays.toString(twoSumOptimised(nums,target)));
    }

    public static int[] findIndex(int[] arr, int target){

        int[] res = new int[2];

        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1; j<arr.length;j++) {
                if (arr[i] + arr[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }

    public static int[] twoSumOptimised(int[] nums, int target)
    {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // Key: Element, Value: Index

        int i = 0;
        for (i=0; i<nums.length; i++)  // O(N)
        // target=6, nums[i] = 1, target- nums[i] = 5
        {
            if (map.containsKey(target-nums[i])) // O(1)
            {
                result[1] = i;
                result[0] = map.get(target-nums[i]); // O(1)
                return result;
            }

            map.put(nums[i], i);
        }

        return result;
    }

}

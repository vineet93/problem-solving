package com.vineet.Tutort.grokking.hashmap;

import java.util.HashMap;

public class CountSubArraySumEqualToK {

    public static void main(String[] args) {

        int[] nums ={1,2,3,3,2,1};
        int k=3;

        System.out.println(subarraySum(nums,k));

    }

    public static int subarraySum(int[] nums, int k) {

        int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);                                       //Initially we don't have anything hence we are adding sum as 0 and freq as 1.
        for(int j=0;j<nums.length;j++){
            sum += nums[j];                                 //calc prefix sum.
            if(map.containsKey(sum -k)){                    //sum = k + y; sum - k = y
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1); // Creating the frequency map of sum as every
                                                                // element is added to the prefix sum.
        }
        return ans;

    }
}

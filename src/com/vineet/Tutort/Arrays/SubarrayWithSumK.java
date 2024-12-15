package com.vineet.Tutort.Arrays;

import java.util.HashMap;

public class SubarrayWithSumK {

    public static void main(String[] args) {

        int[] arr = {3,9,-2,4,1,-7,2,6,-5};
        int k=5;
        System.out.println(subarraySum(arr,k));
    }

    public static int subarraySum(int[] nums, int k) {

        int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int j=0;j<nums.length;j++){
            sum += nums[j];
            if(map.containsKey(sum -k)){
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}

package com.vineet.Tutort.Arrays;

import java.util.HashMap;

public class ContainDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                if(Math.abs(hm.get(nums[i]) - i) <= k){
                    return true;
                }
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}

package com.vineet.Tutort.Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/missing-ranges/
public class MissingRange {
    public static void main(String[] args) {
        int[] nums = {0,2,3,6,10};
        List<String> ans = findMissingRange(nums);
    }

    public static List<String> findMissingRange(int[] nums){

        List<String> list = new ArrayList<>();

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int low =0;
        for(int i=0;i<nums.length;i++){

            if(i == nums[i]){
                list.add(low + "->" + (nums[i]-1));
                low=nums[i]+1;
            }
        }

        return list;
        }

    }

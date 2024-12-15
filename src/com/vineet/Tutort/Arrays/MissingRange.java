package com.vineet.Tutort.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/missing-ranges/
public class MissingRange {
    public static void main(String[] args) {
        int[] nums = {0,1,3,50,75};
        int  lower = 0, upper = 99;
        List<List<Integer>> ans = findMissingRange(nums,lower,upper);
        System.out.println(ans);
    }

    public static List<List<Integer>> findMissingRange(int[] nums,int lower,int upper) {

        int n = nums.length;
//        if (n == 0) {
//            return List.of(List.of(lower, upper));
//        }
        List<List<Integer>> ans = new ArrayList<>();
        if (nums[0] > lower) {
            ans.add(Arrays.asList(lower, nums[0] - 1));
        }
        for (int i = 1; i < n; ++i) {
            if (nums[i] - nums[i - 1] > 1) {
                ans.add(Arrays.asList(nums[i - 1] + 1, nums[i] - 1));
            }
        }
        if (nums[n - 1] < upper) {
            ans.add(Arrays.asList(nums[n - 1] + 1, upper));
        }
        return ans;
         }
    }

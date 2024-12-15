package com.vineet.Tutort.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://leetcode.com/problems/majority-element-ii/
public class MajorityElement2 {
    public static void main(String[] args) {

        int[] nums = {2,2};
        System.out.println("Majority Element is :" + majorityElement2(nums));
    }

    public static List<Integer> majorityElement2(int[] nums) {


        List<Integer> list = new ArrayList<>();

        int mE = nums.length / 3;
        Arrays.sort(nums);
        int ele = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (ele == nums[i]) {
                count++;
            } else {
                ele = nums[i];
                count = 1;
            }

            if (count > mE && !list.contains(ele)) {
                list.add(ele);
            }
        }
        return list;
    }
}

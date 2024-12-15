package com.vineet.Tutort.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

//    public static void sortColors(int[] nums) {
//        TreeMap<Integer,Integer> hm = new TreeMap<>();
//
//        for(Integer val : nums){
//            hm.put(val,hm.getOrDefault(val,0)+1);
//        }
//
//        int index=0;
//        for(Integer val:hm.keySet()){
//            int count = hm.get(val);
//            while(count > 0){
//                nums[index]= val;
//                index++;
//                count--;
//            }
//        }
//
//        System.out.println(Arrays.toString(nums));
//    }

    public static void sortColors(int[] nums)
    {
        int i = 0;
        int n = nums.length;
        int start = 0, end = n-1;

        while (i<=end)
        {
            if (nums[i] == 0)
            {
                swap(nums, i, start);
                start++;
                i++;
            }

            else if (nums[i] == 1)
                i++;

            else if(nums[i] == 2)
            {
                swap(nums, i, end);
                end--;
            }
        }
    }

    public static void swap(int[] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

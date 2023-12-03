package com.vineet.Tutort.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
        int[] nums1 = {1,2,3,4};
        System.out.println(containsDuplicateOptimised(nums1));
    }

    public static boolean containsDuplicate(int[] nums) {


        Arrays.sort(nums);
        boolean flag = false;

        int index=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[index]){
                nums[index+1] = nums[i];
                index++;
            } else{
                flag = true;
                break;
            }
        }
        return flag;

    }

    public static boolean containsDuplicateOptimised(int[] nums) {

        HashSet<Integer> hs= new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }

        return false;
    }
}

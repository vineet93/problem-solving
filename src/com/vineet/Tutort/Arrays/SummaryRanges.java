package com.vineet.Tutort.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryRanges {

    public static void main(String[] args) {

       int[] nums = {0,1,2,4,5,7};
       List list = summaryRanges(nums);
       list.stream().forEach(s-> System.out.println(s));
    }

    public static List<String> summaryRanges(int[] nums) {

        ArrayList<String> al = new ArrayList<>();
        int start =0;
        for(int i =0;i<nums.length;i++){
           if(i==nums.length-1 || nums[i+1] != nums[i]+1){
               if(nums[start] != nums[i]){
                   al.add(""+nums[start]+"->"+nums[i]);
               } else {
                   al.add(nums[start]+"");
               }

               if(i != nums.length-1)
                   start= i+1;
           }
        }

        return al;
    }
}

package com.vineet.Tutort.sorting;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/largest-number/
public class LargestNumber {

    public static void main(String[] args) {

        int[] arr={3,30,34,5,9};
        System.out.println("Largest Number is : " + largestNumber(arr));

    }

    public static String largestNumber(int[] nums){

        if (nums == null || nums.length == 0)
            return "";

        int i = 0;
        int n = nums.length;
        String[] s_num = new String[n];

        for (i=0; i<n; i++)
        {
            s_num[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comp = (s1, s2) -> {
            String str1 = s1 + s2;
            String str2 = s2 + s1;

            return str2.compareTo(str1);
        };

        Arrays.sort(s_num, comp);


        if (s_num[0].charAt(0) == '0')
            return "0";

        StringBuilder ans = new StringBuilder();
        for (String s: s_num)
            ans.append(s);

        return ans.toString();
    }
}

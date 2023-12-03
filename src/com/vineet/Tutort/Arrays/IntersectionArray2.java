package com.vineet.Tutort.Arrays;

import java.util.*;
import java.util.Arrays;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class IntersectionArray2 {
    public static void main(String[] args) {

        int[]  nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {


        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums1)
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                int freq = map.get(num);
                freq--;
                map.put(num, freq);
            }
        }

        int index=0;
        int[] arr = new int[result.size()];
        for(int val: result){
            arr[index] = val;
            index++;
        }

        return arr;
    }
}

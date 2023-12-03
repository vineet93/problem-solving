package com.vineet.Tutort.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionArray {

    public static void main(String[] args) {

        int[]  nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
        System.out.println("Optimised version " + Arrays.toString(intersectionOptimised(nums1,nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {


        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int val:nums1){
            hs.add(val);
        }

        for(int val1:nums2){
            if(hs.contains(val1) && !al.contains(val1)){
                al.add(val1);
            }
        }

        int[] arr = al.stream().mapToInt(i -> i).toArray();

        return arr;
    }

    public static int[] intersectionOptimised(int[] nums1, int[] nums2) {

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int val:nums1){
            hs1.add(val);
        }

        for(int val:nums2){
            if(hs1.contains(val)){
                hs2.add(val);
            }
        }

        int index=0;
        int[] arr = new int[hs2.size()];
        for(int val: hs2){
            arr[index] = val;
            index++;
        }

        return arr;
    }
}

package com.vineet.Tutort.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/submissions/

public class MergeSortedArray1 {

    public static void main(String[] args) {

        int[] nums1 = {3,4,8,10,0,0,0};
        int[] nums2 = {2,5,6};
        MergeSortedArray1.merge(nums1,4,nums2,3);

        int[] nums3 = {1};
        int[] nums4 = {};
        MergeSortedArray1.merge(nums3,1,nums4,0);

        int[] nums5 = {0};
        int[] nums6 = {1};
        MergeSortedArray1.merge(nums5,0,nums6,1);

    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        int f1  = m-1; // 4 -1 = 3
        int f2  = n-1; // 3-1 = 2
        int fmerge = m+n-1; // 4+3 - 1 = 6

        while(f2 >=0 ){
            if(f1 >=0 && nums1[f1] > nums2[f2]){
                nums1[fmerge] = nums1[f1];
                fmerge--;
                f1--;
            } else{
                nums1[fmerge] = nums2[f2];
                fmerge--;
                f2--;
            }
        }



        System.out.println(Arrays.toString(nums1));


    }

}

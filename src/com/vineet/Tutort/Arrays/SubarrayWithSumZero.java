package com.vineet.Tutort.Arrays;

import java.util.HashSet;

//https://www.geeksforgeeks.org/find-if-there-is-a-subarray-with-0-sum/
public class SubarrayWithSumZero {

    public static void main(String[] args) {

        //Test Case 1
        int[] arr1= {4, 2, -3, 1, 6};
        System.out.println("Test Case 1: " + subarrayWithSumZero(arr1,arr1.length));

        //Test Case 2
        int[] arr2= {4, 2, 0 ,1,6};
        System.out.println("Test Case 1: " + subarrayWithSumZero(arr2,arr2.length));

        //Test Case 3
        int[] arr3= {-3,2,3,1,6};
        System.out.println("Test Case 1: " + subarrayWithSumZero(arr3,arr3.length));
    }

    static boolean subarrayWithSumZero(int[] arr, int n)
    {
        int prefixSum =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            prefixSum += arr[i];
            if(prefixSum == 0 || set.contains(prefixSum)){
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }
}

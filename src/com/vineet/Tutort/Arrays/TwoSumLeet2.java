package com.vineet.Tutort.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

//Input [2,7,11,15] , target =9
//Output [1, 2];

import java.util.Arrays;

public class TwoSumLeet2 {

    public static void main(String[] args) {
       int[]  numbers = {2,7,11,15} ;
       int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int start= 0;
        int end = numbers.length - 1;
        int[] res = new int[2];

        while(start < end){

            if(numbers[start] + numbers[end] == target){

                res[0] = start+1;
                res[1] = end+1;
                return res;

            } else if(numbers[start] + numbers[end] > target){
                end--;
            } else {
                start++;
            }
        }

        return res;

    }
}

package com.vineet.Tutort.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        //int k = removeElement(arr, val);
        int M = removeElementOptimised(arr, val);
        System.out.println(M);
    }

    public static int removeElement(int[] arr, int val) {

        int swapCount = 0;
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i] != val) {
                    swapCount++;
                    break;
                } else if(arr[i] == val){
                    if(arr[j] != val){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        swapCount++;
                        break;

                    }
                }
            }
        }

        return swapCount;
    }

    public static int removeElementOptimised(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
package com.vineet.Tutort.recursion;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 6, 8};
        int index=0;
        reverseArray(index,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int start , int end,int[] arr){

        if(start == end)
            return;
        swap(start,end,arr);
        reverseArray(start+1,end-1,arr);

    }

    public static void swap(int l,int r,int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}

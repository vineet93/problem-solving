package com.vineet.Tutort.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = {4,2,6,8,5};
        ReverseArray.reverse(arr,arr.length);
    }


    static void reverse(int[] arr, int n)

    {

        for(int i=0;i<n/2;i++){
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[i];
            arr[i] = temp;
        }


        for(int val : arr){
            System.out.print(val+" ");
        }
    }

}

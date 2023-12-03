package com.vineet.Tutort.Arrays;


// Find Max and Min Element in an Array in a Single Pass

public class MaxMinArray {

    public static void main(String[] args) {

        int arr[] = {10,20,20,40,8,60};
        MaxMinArray.minMax(arr);

    }

    public static void minMax(int arr[]){

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                    max=arr[i];
            }

            if(arr[i] < min){
                    min=arr[i];
            }
        }

        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);
    }
}

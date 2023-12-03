package com.vineet.Tutort.Arrays;

public class Arrays {

    public static void main(String[] args) {


        int arr[] = {1,2,3,4,5};
        int n = arr.length;

        printArray(arr,5);
        printArray2(arr,n);

        int sum=  sumOfArray(arr,n);
        System.out.println(sum);

        long sum1=  sumOfArray1(arr,n);
        System.out.println(sum);
    }

    static void printArray(int[] arr , int n ) {

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+ " ");
        }
    }

    static void printArray2(int[] arr , int n ) {

        for(int val : arr){
            System.out.println(val);
        }
    }

    static int sumOfArray(int[] arr, int n){

        int sum =0;
        for(int val : arr) {
            sum = sum + val;
        }
        return sum;
    }



    // Below method is much optimised as compared to the above one.
    // sum += val should be write like this.
    static long sumOfArray1(int[] arr, int n){

        long sum =0;
        for(int val : arr) {
            sum += val;
        }
        return sum;
    }


}

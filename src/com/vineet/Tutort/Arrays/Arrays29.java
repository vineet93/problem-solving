package com.vineet.Tutort.Arrays;

public class Arrays29 {

    public static void main(String[] args) {


        int arr[] = {10,12,20,4};
        String s = "hello";
        Arrays29.maxEle(arr);
        Arrays29.minMax(arr);
        Arrays29.find2Max(arr,arr.length);
        Arrays29.reverse(arr,arr.length);
        Arrays29.reverseVowels(s);

    }

    public static void maxEle(int arr[]){

        int max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                if(arr[i]>max)
                max=arr[i];
            }
        }

        System.out.println(max);
    }

    public static void minMax(int arr[]){

        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                if(arr[i]>max)
                max=arr[i];
            }

            if(arr[i] < arr[i+1]){
                if(arr[i]<min)
                min=arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static void find2Max(int arr[],int n){



        int first_max=0;
        int second_max=0;

        if(arr.length<2)
            System.out.println("Invalid Input");

        if(arr[0] > arr[1]){
            first_max=arr[0];
            second_max=arr[1];
        } else{
            second_max=arr[0];
            first_max=arr[1];
        }

        for(int val : arr) {

            if(val > first_max){

            }
        }

    }


    static void reverse(int[] arr, int n)

    {

        for(int i=0;i<n/2;i++){
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[i];
            arr[i] = temp;
        }


        for(int val : arr){
            System.out.print(val+",");
        }
    }

    boolean isVowel(char c){


        return true;
    }

    public static void reverseVowels(String s) {

        int start =0 ;
        int end = s.length()-1;



    }
}

package com.vineet.Tutort.Arrays;

public class EquilibriumIndex {

    public static void main(String[] args) {

        int[] arr = {-7,1,5,2,-4,3,0};
        int size = arr.length;
        System.out.println(equilibriumIndex(arr,size));
    }

    public static int equilibriumIndex(int[] arr, int n){

        if(n==1)
            return 0;

        if(n==0)
            return -1;


        int leftSum;
        int rightSum;

        for(int i=0;i<n;i++){
            leftSum=0;
            for(int j=0;j<i;j++) {
                leftSum += arr[j];
            }

            rightSum =0;
            for(int j=i+1;j<n;j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum)
                return i;
        }

        return -1;

    }


}

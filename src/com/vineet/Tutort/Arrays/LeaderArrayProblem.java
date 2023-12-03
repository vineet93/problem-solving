package com.vineet.Tutort.Arrays;

public class LeaderArrayProblem {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2,};
        findLeaders(arr);
    }

    private static void findLeaders(int[] arr) {

        int max=0;
        int len =arr.length;

        if(arr.length>1){
            System.out.print(arr[len-1]+" ");
        }

        for(int i=len-2;i>=0;i--){
            if(arr[i] > max){
                max=arr[i];
                System.out.print(arr[i]+" ");
            }
        }

    }
}

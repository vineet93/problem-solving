package com.vineet.Tutort.Arrays;


public class TwoMaxValue {

    public static void main(String[] args) {

        int arr[]= {-2,1,10,15};
        find2Max(arr,arr.length);
        // OP : 15 10

        int arr2[]= {-2,1,10,15,15};
        find2Max(arr2,arr2.length);
        // OP : 15 15

        int arr3[]= {2,13,15,17,9,5,12,8,16,19,18,19};
        find2Max(arr3,arr3.length);
        // OP : 19 19

        int arr4[]= {4,1};
        find2Max(arr4,arr4.length);
        // OP : 4 1

        int arr5[]= {1,1};
        find2Max(arr5,arr5.length);
        // OP : 1 1

        int arr6[]= {1};
        find2Max(arr6,arr6.length);
        // OP : Invalid Input
    }

    public static void find2Max (int arr[], int size){

        if(size < 2){
            System.out.println("Invalid Input");
            return;
        }

        int first = arr[0];
        int second = Integer.MIN_VALUE;

        for(int i=1 ; i<size ; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            } else if(arr[i] > second){
                second = arr[i];
            }
        }

        System.out.println("First Max : "+ first + " Second Max : "+ second);

    }
}

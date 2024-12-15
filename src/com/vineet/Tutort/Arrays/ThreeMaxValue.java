package com.vineet.Tutort.Arrays;

import javax.sound.midi.Soundbank;
import java.util.HashSet;

public class ThreeMaxValue {

    public static void main(String[] args) {

        int arr[]= {-2,1,10,15};
        find3Max(arr,arr.length);
        // OP : 15 10 1

        int arr2[]= {-2,1,10,15,15};
        find3Max(arr2,arr2.length);
        // OP : 15 15 10

        int arr3[]= {2,13,15,17,9,5,12,8,16,19,18,19};
        find3Max(arr3,arr3.length);
        // OP : 19 19 18

        int arr4[]= {4,1,1};
        find3Max(arr4,arr4.length);
        // OP : 4 1 1

        int arr5[]= {1,1,1};
        find3Max(arr5,arr5.length);
        // OP : 1 1 1

        int arr6[]= {1,2};
        find3Max(arr6,arr6.length);
        // OP : Invalid Input

        int arr7[]= {1,1,2};
        find3Max(arr7,arr7.length);
        // OP : 2 1 1


    }

    public static void find3Max(int[] arr, int size){

        int firstMax  = arr[0];
        int secondMax = Integer.MIN_VALUE;
        int thirdMax  = Integer.MIN_VALUE;

        for(int i=1;i<size;i++) {
            if (arr[i] == firstMax || arr[i] == secondMax || arr[i] == thirdMax) continue;
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else {
                thirdMax = arr[i];
            }
        }
        System.out.println("First Max : "+ firstMax + " Second Max : "+ secondMax + " Third Max : "+ thirdMax);

    }
}

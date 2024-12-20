package com.vineet.Tutort.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
public class ReplaceElementWithGreatestElementRightSide {

    public static void main(String[] args) {

        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {

        int max =-1;

        for(int i=arr.length-1;i>=0;i--){

            if(arr[i] > max){
                int temp = max;
                max=arr[i];
                arr[i] = temp;
            }else {
                arr[i] = max;
            }
        }
    return arr;
    }
}

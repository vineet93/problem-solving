package com.vineet.Tutort.Xor;

import java.util.Arrays;

//https://leetcode.com/problems/decode-xored-array/description/
public class DecodeXorArray {

    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        int first =4;
        int[] ans=DecodeXorArray.decode(encoded,first);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0]=first;


        for(int i=0;i<encoded.length;i++){
            arr[i + 1] = arr[i] ^ encoded[i]; // Property of XOR: Inverse of XOR is also XOR
        }
        return arr;
    }
}

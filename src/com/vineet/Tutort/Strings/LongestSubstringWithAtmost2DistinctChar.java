package com.vineet.Tutort.Strings;


public class LongestSubstringWithAtmost2DistinctChar {
    public static void main(String[] args) {

        String s = "ccaabbb";
        System.out.println("Longest Substring with At Most 2 Distinct Character is : "+ lengthOfLongestSubstringTwoDistinct(s));

//        Example :
//        Input: s = "ccaabbb"
//        Output: 5
//        Explanation: The substring is "aabbb" which its length is 5.
    }

    public static int lengthOfLongestSubstringTwoDistinct(String s) {

//        Approach:
//
//        Siding Window + Map/Freq Array
//
//
//        (1) Map/Freq Array:
//        Keep Track of count of each unique character and uniqueCounter <= K
//
//
//                - If Unique: Expand Window Size, uniqueCounter++
//                - If Repeated: Decrease Window Size, uniqueCounter--
//
//
//        (2) Maintain Window Size Using left and right Pointer
//
//
//        TC: O(N)
//        SC: O(128)


        int k=2;
        int i=0,j=0;
        int maxLength=0;
        int[] arr= new int[128];
        int uniqueCounter=0;
        while(j<s.length()){ // J (WindowSize) is increasing ALWAYS.

            if(arr[s.charAt(j++)]++ == 0){ // 1.) Increasing index for character in frequency array  and value of window Size
                uniqueCounter++;           // and unique counter for every unique element added.

                while(uniqueCounter>k){  // 2.) Once the unique counter increases more than K.

                    if(--arr[s.charAt(i++)] == 0){ // 3.) Decrease the index count in frequency array until
                        uniqueCounter--;          //it becomes 0 and then also decrease the unique counter.
                    }
                }
            }
            maxLength = Math.max(maxLength,j-i); // 4.) Max length will be calculated whenever windows size changes.
        }
        return maxLength;
    }
}

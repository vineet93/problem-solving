package com.vineet.Tutort.grokking.slidingwindow;


// 1.) Leetcode https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/description
// 2.) Lintcode https://www.lintcode.com/problem/386
public class LongestSubstringWithAtmostKDistinctChar {

    public static void main(String[] args) {

       String  s = "eceba";
       int k = 3;
       System.out.println(lengthOfLongestSubstringKDistinct(s,k));

    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {

        int i=0,j=0;
        int maxLength=0;
        int[] arr= new int[128];
        int uniqueCounter=0;
        while(j<s.length()){ // J (WindowSize) is increasing ALWAYS.

            if(arr[s.charAt(j++)]++ == 0){          // 1.) Increasing index for character in frequency array  and value of window Size
                uniqueCounter++;                    // and unique counter for every unique element added.

                while(uniqueCounter>k){             // 2.) Once the unique counter increases more than K.

                    if(--arr[s.charAt(i++)] == 0){  // 3.) Decrease the index count in frequency array until
                        uniqueCounter--;            // it becomes 0 and then also decrease the unique counter.
                    }
                }
            }
            maxLength = Math.max(maxLength,j-i);    // 4.) Max length will be calculated whenever windows size changes.
        }
        return maxLength;
    }
}

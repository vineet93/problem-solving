package com.vineet.Tutort.grokking.slidingwindow;

import java.util.HashSet;

// vvvvv Imp Ques
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {

        String s= "abcabcbb";
        System.out.println("Longest Substring without repeating character is of length :" + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        // Approach:
//
//        Sliding Window + Set
//
//
//        (1) If Unique Characters (Not present in Set),
//                Increase Window Size: j++
//
//        (2) If Repeating Characters (Present in Set),
//                Decrease Window Size: i++
//
//        Maintain ans = max(j-i+1)

        HashSet<Character>  hs = new HashSet<>();

        int i=0,j=0;
        int maxLength=0;

        while(j < s.length()) {

            //1.) if Not Contain in Hashset
            // --> Add into HashSet.
            // --> Increase WindowSize.
            // --> Find Max Length.

            if (!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, hs.size());
            } else
            {
                //Already Contained in Set.
                // --> Remove the Duplicate.
                // --> Decrease WindowSize.

                hs.remove(s.charAt(i));
                i++;

            }
        }

        return maxLength;
    }
}

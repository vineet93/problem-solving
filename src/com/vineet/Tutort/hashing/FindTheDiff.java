package com.vineet.Tutort.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class FindTheDiff {

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));
    }

    public static  char findTheDifference(String s, String t) {

        int sum=0;
        if(s == "")
            return t.charAt(0);

        for(Character ch:t.toCharArray()){
            sum +=ch;
        }

        for(Character ch:s.toCharArray()){
            sum -=ch;
        }
        System.out.println(sum);


        char ans = (char) sum;

        return ans;
    }
}

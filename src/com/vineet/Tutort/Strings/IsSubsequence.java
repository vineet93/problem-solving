package com.vineet.Tutort.Strings;

import java.util.HashSet;
import java.util.Set;

public class IsSubsequence {

    public static void main(String[] args) {

        String s = "ab", t = "baab";
        System.out.println(isSubsequence(s,t));

    }

    public static boolean isSubsequence(String s, String t) {
        int sP=0;
        int tP=0;

        while(sP < s.length() && tP < t.length()){
            if(s.charAt(sP) == t.charAt(tP)){
                sP++;
            }
            tP++;
        }

        return sP == s.length();
    }
}

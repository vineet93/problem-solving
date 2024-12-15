package com.vineet.Tutort.Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {

        // Isomorphic String: Two strings s and t are isomorphic if the characters in s can be
        // replaced to get t.

        String s = "paper", t = "title";
        System.out.println("Strings are Isomorphic or Not : " + isIsomorphic(s,t));
        System.out.println("Strings are IsomorphicHash or Not : " + isIsomorphicHash(s,t));
    }

    public static  boolean isIsomorphic(String s, String t) {

        int[] arrS = new int[256];
        int[] arrT = new int[256];

        for(int i = 0; i < s.length(); i++){
            char chS=s.charAt(i);
            char chT=t.charAt(i);
            if(arrS[chS] != arrT[chT])
                return false;

            arrS[chS] = i+1;
            arrT[chT] = i+1;
        }
        return true;
    }

    public static boolean isIsomorphicHash(String s, String t) {

        if (s == t)
            return true;

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            int indexS = mapS.getOrDefault(s.charAt(i), -1);
            int indexT = mapT.getOrDefault(t.charAt(i), -1);

            if (indexS != indexT)
                return false;

            mapS.put(s.charAt(i), i);
            mapT.put(t.charAt(i), i);
        }
        return true;
    }
}

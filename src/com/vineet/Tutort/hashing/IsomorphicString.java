package com.vineet.Tutort.hashing;

import java.util.HashMap;

//https://leetcode.com/problems/isomorphic-strings/description/
public class IsomorphicString {
    public static void main(String[] args) {

        String s = "paper", t = "title";
        System.out.println("Strings are Isomorphic : " + isIsomorphic(s,t));

    }

    public static boolean isIsomorphic(String s, String t) {

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

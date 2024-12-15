package com.vineet.Tutort.Strings;

import java.util.HashMap;

public class Anagram {

    //https://leetcode.com/problems/valid-anagram/
    public static void main(String[] args) {

        String s = "rat", t = "car";
        System.out.println("Strings are Anagram HashMap Based ..?? : "+isAnagram(s,t));
        System.out.println("Strings are Anagram Array Based ..?? : "+isAnagramArrayBased(s,t));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        if(s == t)
            return true;

        boolean flag = true;
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();

        int i=0,j=0;
        for(i=0;i<s.length();i++){
           map1.put(s.charAt(i), (map1.getOrDefault(s.charAt(i),0) + 1));
        }

        for(j=0;j<t.length();j++){
            map2.put(t.charAt(j), (map2.getOrDefault(t.charAt(j),0) + 1));
        }

        for(Character  val : map1.keySet()){
            if(map2.containsKey(val) && map2.get(val).equals(map1.get(val))){
                continue;
            } else{
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isAnagramArrayBased(String s, String t) {

        boolean flag = true;
        if(s.length() != t.length())
            return false;

        if(s == t)
            return true;

        int[] arr = new int[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int val : arr){
            if(val !=0) {

                flag = false;
                break;
            }
        }
        return flag;
    }
}

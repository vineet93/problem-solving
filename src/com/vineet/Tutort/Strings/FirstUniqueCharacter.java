package com.vineet.Tutort.Strings;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String s = "anshika";
        System.out.println(firstUniqChar(s));
    }

    public static char firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map1 = new LinkedHashMap<>();
        char ch=' ';

        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i), (map1.getOrDefault(s.charAt(i),0) + 1));
        }

        for(Character  val : map1.keySet()){
            if(map1.get(val) == 1 ){
                ch = val;
                break;
            }
        }

        return ch;


    }
}

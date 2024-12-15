package com.vineet.Tutort.hashing;

//https://leetcode.com/submissions/detail/1171203782/
import java.util.HashMap;

public class MostCommonWord {

    public static void main(String[] args) {

       String paragraph = "a, a, a, a, b,b,b,c, c";
       String[] banned = {"a"};
        System.out.println(mostCommonWord(paragraph,banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {

        String[] words = paragraph.replaceAll("\\W", " ").toLowerCase().split("\\s+");

        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> bannedMap = new HashMap<>();

        for(String val : banned){
            bannedMap.put(val,bannedMap.getOrDefault(val,0) + 1);
        }

        for(String val : words){
            if(!bannedMap.containsKey(val)){
                map.put(val,map.getOrDefault(val,0) + 1);
            }
        }

        int max=0;;
        for(Integer val: map.values()){
            if(val > max)
                max=val;
        }

        String ans="";
        for(String val: map.keySet()){
            if(map.get(val) == max)
                ans=val;
        }
        return ans;
    }
}

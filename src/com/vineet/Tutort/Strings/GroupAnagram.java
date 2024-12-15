package com.vineet.Tutort.Strings;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String[] strs1 = {""};
        System.out.println(groupAnagrams(strs));
        System.out.println(groupAnagrams(strs1));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0)
            return new ArrayList<>();

        List<List<String>> wordList = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();

        int i;
        for(i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String temp = String.valueOf(arr);
            if(hm.containsKey(temp)){
                List<String> ls = hm.get(temp);
                ls.add(strs[i]);
                hm.put(temp,ls);
            }else{

                List<String> list = new ArrayList<String>();
                list.add(strs[i]);
                hm.put(temp,list);
            }
        }

        for(List<String> val : hm.values()){
            wordList.add(val);
        }

        return wordList;
    }
}

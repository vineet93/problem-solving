package com.vineet.Tutort.hashing;

import java.util.*;

//https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
public class SubstringWithConcatenationOfAllWords {

    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};
        System.out.println(findSubstring(s,words));

    }

    public static List<Integer> findSubstring(String s, String[] words) {

        int count = words.length;
        int wordLength = words[0].length();
        List<Integer> indexList = new ArrayList<>();
        int totalComb = count * wordLength ;


        HashMap<String,Integer> wordsMap = new HashMap<>();
        Arrays.stream(words).forEach(word -> wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1));

        for(int i=0;i<=s.length() - wordLength * count; ++i){
            if (isContainsAllWords(wordsMap, s.substring(i, i + wordLength * count), wordLength))
                indexList.add(i);
        }
            return indexList;
    }

    private static boolean isContainsAllWords(Map<String, Integer> wordsMap, String substring, int wordLength) {
        Map<String, Integer> substringWordsMap = new HashMap<>();
        for (int i = 0; i < substring.length(); i += wordLength) {
            String word = substring.substring(i, i + wordLength);
            substringWordsMap.put(word, substringWordsMap.getOrDefault(word, 0) + 1);

            if (substringWordsMap.get(word) > wordsMap.getOrDefault(word, 0))
                return false;
        }
        return substringWordsMap.equals(wordsMap);
    }

}

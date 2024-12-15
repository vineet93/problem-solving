package com.vineet.Tutort.Strings;

public class FirstOccurenceInString {

    public static void main(String[] args) {

        String haystack = "sardbutsad", needle = "sad";
        System.out.println(getIndexOfFirstOccurence1(haystack,needle));
        System.out.println(getIndexOfFirstOccurence2(haystack,needle));
    }

    private static int getIndexOfFirstOccurence1(String haystack, String needle) {

        int index=-1;

        if(haystack.contains(needle)){
            index = haystack.indexOf(needle);
        }
        return index;
    }

    private static int getIndexOfFirstOccurence2(String haystack, String needle) {

        int index=-1;

        int needleLength = needle.length();
        int haystackLength = haystack.length();

        if(haystackLength < needleLength)
            return -1;

        for(int i=0;i<=haystackLength-needleLength;i++){
            String temp = haystack.substring(i,needleLength+i);
            if(temp.equals(needle)){
                index=i;
                break;
            }
        }

       return index;
    }

}

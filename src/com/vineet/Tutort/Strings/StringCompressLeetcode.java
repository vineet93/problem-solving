package com.vineet.Tutort.Strings;

//https://leetcode.com/problems/string-compression/description/
public class StringCompressLeetcode {

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        //output = Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
        System.out.println(compressString(chars));
    }

    public static int compressString(char[] chars){

        int currentLength = 1;

        StringBuilder result = new StringBuilder(); // empty string
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i-1]) {
                currentLength++;
            } else {
                System.out.println(currentLength + "" + chars[i-1]);
                result.append(chars[i-1]).append(currentLength > 1 ? currentLength : "");
                currentLength = 1; // reset the length
            }
        }

        // print last one
        System.out.println(currentLength + "" + chars[chars.length - 1]);
        result.append(chars[chars.length - 1]).append(currentLength > 1 ? currentLength : "");

        int index =0;
        for(Character val : result.toString().toCharArray()){
            chars[index] = val;
            index++;
        }
        return result.toString().length();
    }
}

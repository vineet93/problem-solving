package com.vineet.Tutort.Arrays;


// Leetcode 345. Reverse Vowels of a String
// https://leetcode.com/problems/reverse-vowels-of-a-string/
public class ReverseVowel {

    public static void main(String[] args) {



        String s = "Leetcode";
        String rev = "Leotcede";

            String reverseString = ReverseVowel.reverseVowels(s);
        if (reverseString.equals(rev)){
            System.out.println("String is reversed");
        } else {
            System.out.println("String not reversed");
        }
    }

    public static String reverseVowels(String s) {

        char[] ch = s.toCharArray();
        int start=0;
        int end = s.length()-1;

        while(start < end) {
            if (!isVowel(ch[start])) {
                start++;
                continue;
            }

            if (!isVowel(ch[end])) {
                end--;
                continue;
            }

            char temp = ch[start];
            ch[start] = ch[end];
            ch[end]  = temp;

            start++;
            end--;

        }

        String s1 = new String(ch);

        return s1;
    }

     public static Boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

            return true;
        }
        return false;
    }
}

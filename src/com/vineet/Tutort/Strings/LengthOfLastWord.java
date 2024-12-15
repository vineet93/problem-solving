package com.vineet.Tutort.Strings;


//https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  and heaven";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {

        // 1.) Way using the String inbuilt Function

//       String[] splitString = s.split(" ");
//           int n=splitString.length;
//           return splitString[n-1].length()

        // 2.) Without using string inbuilt function.

        int count=0;
        int len=0;

        for (int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ' && count > 0){
                len=count;
                count=0;

            }
            if(s.charAt(i) != ' '){
                count++;
            }

            if(i == s.length()-1 && s.charAt(i) != ' ')
                len=count;
        }
            return len;
        }
}

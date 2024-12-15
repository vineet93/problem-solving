package com.vineet.Tutort.Strings;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String s="acaba";
        System.out.println("Longest Palindromic Substring : " + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {


        if(s.length() == 1)
            return s;

        if(s.length() == 2)
            return  String.valueOf(s.charAt(0));

        int maxLength=0;
        boolean flag=false;
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
               flag = isPalindrome(i,j,s);
               if(flag){
                   maxLength= Math.max(maxLength,j-i);
                   ans = s.substring(i,j+1);
               }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(int i ,int j, String s){


        boolean flag = false;

        String str="";

        for(int k=j;k>=i;k--){
            str = str + s.charAt(k);
        }

        if(str.equals(s.substring(i,j+1)))
            return true;

        return flag;
    }
}

package com.vineet.Tutort.Strings;

public class Palindrome {

    public static void main(String[] args) {

        String s="aba";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){

        if(s.length() == 1 || s.length() == 2)
            return true;


        boolean flag = false;

        String str="";

        for(int i=s.length()-1;i>=0;i--){
            str = str + s.charAt(i);
        }

        if(str.equals(s))
            return true;

        return flag;
    }
}

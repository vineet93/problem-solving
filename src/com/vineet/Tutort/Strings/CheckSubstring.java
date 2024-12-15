package com.vineet.Tutort.Strings;

public class CheckSubstring {

    public static void main(String[] args) {

        String a="vineet";
        String b="vin";
        System.out.println(checkSubstring(a,b));
    }

    public static boolean checkSubstring(String a, String b){

        return a.contains(b);

        // OR

        // return (a.indexOf(b) != -1);
    }
}

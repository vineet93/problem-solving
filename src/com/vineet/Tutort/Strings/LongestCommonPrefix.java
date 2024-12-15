package com.vineet.Tutort.Strings;


//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
            String ans="";
            String minString =strs[0];

            for(String val:strs){
                if(val.length() < minString.length()){
                    minString = val;
                }
            }

            for(int i=0;i<minString.length();i++){
                boolean flag = true;
                char prefixChar = minString.charAt(i);

                for(int j=0;j<strs.length;j++){
                    if(prefixChar == strs[j].charAt(i)){
                         continue;
                    } else{
                        flag=false;
                    }
                }

                if(!flag){
                    break;
                }else {
                    ans += prefixChar;
                }
            }
            return ans;
    }
}

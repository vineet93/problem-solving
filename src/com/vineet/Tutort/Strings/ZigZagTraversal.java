package com.vineet.Tutort.Strings;

//https://leetcode.com/problems/zigzag-conversion/description/?envType=study-plan-v2&envId=top-interview-150
public class ZigZagTraversal {

    public static void main(String[] args) {

        String s="PAYPALISHIRING";
        int numRows = 4;
        System.out.println(convert(s,numRows)); // Output: "PINALSIGYAHRPI"
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int len = s.length();
        String[] rows = new String[numRows];
        for (int j = 0; j < numRows; j++) {
            rows[j] = "";
        }

        int i = 0;
        while (i < len) {
            // Going down the rows
            for (int j = 0; j < numRows && i < len; j++) {
                rows[j] += s.charAt(i++);
            }
            // Going up in a zigzag manner
            for (int k = numRows - 2; k > 0 && i < len; k--) {
                rows[k] += s.charAt(i++);
            }
        }

        // Combining rows into a single string output
        String res = "";
        for (String row : rows) {
            res += row;
        }
        return res;
    }
}

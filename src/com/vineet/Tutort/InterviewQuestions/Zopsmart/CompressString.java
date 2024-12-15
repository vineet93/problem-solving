package com.vineet.Tutort.InterviewQuestions.Zopsmart;

// Asked in Zopsmart and Infosys.
public class CompressString {

    public static void main(String[] args) {

        String input = "aaaabbbccaaabbabc";
        System.out.println(compressString(input));
    }

    public static String compressString(String a){

        int currentLength = 1;

        StringBuilder result = new StringBuilder(); // empty string
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                currentLength++;
            } else {
                System.out.println(currentLength + "" + a.charAt(i - 1));
                result.append(currentLength > 1 ? currentLength : "").append(a.charAt(i - 1));
                currentLength = 1; // reset the length
            }
        }

        // print last one
        System.out.println(currentLength + "" + a.charAt(a.length() - 1));
        result.append(currentLength > 1 ? currentLength : "").append(a.charAt(a.length() - 1));
        return result.toString();
    }
}

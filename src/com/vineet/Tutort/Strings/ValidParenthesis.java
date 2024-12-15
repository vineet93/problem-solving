package com.vineet.Tutort.Strings;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

       String s = "([{}])";
        System.out.println(" Parenthesis are valid  : " +isValid(s));
    }

    public static boolean isValid(String s) {

        // 1.) For every opening bracket we are pushing the corresponding closing bracket.
        // 2.) once closing bracket occurs in the loop we pop the top element and check is both are same.
        // 3.) if both are not same the string is invalid and we will return false.
        // 4.) In case off valid string stack will be empty Hence we are returning the same after the loop completes.

        if(s.length() %2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()){

            if(c == '(')
                stack.push(')');
            else if(c == '[')
                stack.push(']');
            else if(c=='{')
                stack.push('}');
            else if( stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
    return stack.isEmpty();
    }
}

package com.vineet.Tutort.InterviewQuestions.Walmart;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        int n=200;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n)
    {
        List<String> list = new ArrayList<>();

        for(int i=100; i<=n;i++){
            if(i%15 == 0){
                list.add("WallMart");
            } else if(i%5 == 0){
                list.add("Mart");
            } else if(i%3 == 0){
                list.add("Wall");
            } else{
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}

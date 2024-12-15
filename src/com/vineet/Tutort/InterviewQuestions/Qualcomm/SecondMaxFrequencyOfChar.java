package com.vineet.Tutort.InterviewQuestions.Qualcomm;

import java.util.HashMap;
//https://www.geeksforgeeks.org/c-program-find-second-frequent-character/
public class SecondMaxFrequencyOfChar {

    public static void main(String[] args) {
        String str = "aabababa";
        System.out.println(maximumFreq(str));
    }
    public static Character maximumFreq(String s){

        char[] ch = s.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(Character val:ch){
            map.put(val,map.getOrDefault(val,0) +1);
        }

        int firstMax=0; // 3
        int secondMax=0; // 2
        for(Character val:map.keySet()){
            if(map.get(val) > firstMax){
                secondMax=firstMax;
                firstMax=map.get(val);
            }else if(map.get(val) > secondMax) {
                secondMax = map.get(val);
            }
        }

        for(Character val:map.keySet()){
            if (secondMax == map.get(val))
                return val;
        }

        return ' ';
    }


}

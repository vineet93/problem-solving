package com.vineet.Tutort.Arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class GreatestNumberCandies {
    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3} ;
        int extraCandies = 3;
        List<Boolean> ans = kidsWithCandies(candies,extraCandies);
        System.out.println(ans);


    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandies=0;
        for(int val:candies){
            if(val > maxCandies){
                maxCandies=val;
            }
        }

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= maxCandies){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;

    }
}

package com.vineet.Tutort.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class SizeToHalf {
    public static void main(String[] args) {
        int[] arr = {1000,1000,3,7};
        System.out.println(minSetSize(arr));
    }

    public static int minSetSize(int[] arr) {

        int size= arr.length;
        int count =0;
        int sum =0;
        Map<Integer,Integer> hm= new HashMap<>();
        TreeSet<Integer>  ts= new TreeSet<>();

        for(int val:arr) {
            if(hm.containsKey(val)){
                hm.put(val,hm.get(val) + 1);
            } else {
                hm.put(val,1);
            }
        }

        for(Integer val:hm.keySet()){
            ts.add(hm.get(val));
        }

        TreeSet<Integer> res = (TreeSet<Integer>)ts.descendingSet();

        for(Integer val:ts){
            if(sum >= (size/2) ){
                return count;
            }
            sum += val;
            count++;
        }

        return 0;
    }
}

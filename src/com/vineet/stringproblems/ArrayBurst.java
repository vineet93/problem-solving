	package com.vineet.stringproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class ArrayBurst {
	
	public static List<String> getShrunkArray(List<String> inputArray, int burstLength) {
        Map<String,Integer> val = new HashMap<String,Integer>();
        List<String> finalList = new ArrayList<String>();
        HashSet<String> hashSet = new HashSet<>();

        Iterator itr = inputArray.iterator();
        while (itr.hasNext()){
            String str=itr.next().toString();
            if(val.keySet().contains(str)){
                val.put(str,val.get(str) + 1);
            }else{
                val.put(str,1);
            }
        }

        for(int j=0;j<inputArray.size();j++){
            if(val.containsKey(inputArray.get(j))){
                if(val.get(inputArray.get(j)) >= burstLength ){
                    val.remove(inputArray.get(j));

                }
            }
        }
       
       for(int k=0;k<inputArray.size();k++){
           if(val.containsKey(inputArray.get(k))){
               finalList.add(inputArray.get(k));
           }
       }
        

    return finalList;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

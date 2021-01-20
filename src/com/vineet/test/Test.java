package com.vineet.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test {
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
		Map<Integer,Integer> count = new HashMap<Integer,Integer>();
        int maxslice=0;
        int len=A.length-1;
        
        for(int i=0;i<A.length;i++){
        	if(count.keySet().contains(A[i])){
        		count.put(A[i],count.get(A[i]) + 1);
            }else{
            	count.put(A[i],1);
            }
        }
        for(int i=0;i<A.length;i++){
        	if(count.get(A[i]) == 1) {
        		if(i !=0 && i<len && count.get(A[i+1])	>= 2) {
        			maxslice++;
        		}else {
        		continue;
        		}
        	} else if(count.get(A[i]) >= 2) {
        		maxslice++;
        	}
        }
        return maxslice;
    }

	public static void main(String[] args) {
		
		//int[] A= {4,2,2,4,2};
		//int[] A= {4,4};
		//int[] A= {1,2,3,2};
		int[] A={0, 5, 4, 4, 5, 12};
		int max=Test.solution(A);
		System.out.println(max);
	}

}

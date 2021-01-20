package com.vneet.maximumsegment;

import java.util.Arrays;
import java.util.List;

public class Maxsegment {
	
	 public static int segment(int x, List<Integer> space) {
		 
		 int length = space.size();
		 int cntr=1;
		 int smallest=0;
		 
				 for(int i=0;i<length; i++) {
			 if(cntr <=x) {
				if(smallest == 0) {
					smallest=space.get(i);
				} else {
					if(space.get(i)<smallest) {
						smallest=space.get(i);
					}
				}
				cntr++;
			 }
		 
	 }
		return x;
	        

	    }
	 
	public static void main(String args[]) {
		
		List<Integer> space = Arrays.asList(2,5,4,6,8);
		int x=3;
		int result =Maxsegment.segment(x, space);
		System.out.println(result);
	}


}

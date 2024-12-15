package com.vineet_prac.maximumsegment;

import java.util.Arrays;
import java.util.List;

public class Maxsegment {
	
	 public static int segment(int x, List<Integer> space) {
		 
		 int length = space.size();
		 int cntr=1;
		 int smallest=0;

		 for (Integer integer : space) {
			 if (cntr <= x) {
				 if (smallest == 0) {
					 smallest = integer;
				 } else {
					 if (integer < smallest) {
						 smallest = integer;
					 }
				 }
				 cntr++;
			 }

		 }
		return x;
	 }
	 
	public static void main(String[] args) {
		
		List<Integer> space = Arrays.asList(2,5,4,6,8);
		int x=3;
		int result =Maxsegment.segment(x, space);
		System.out.println(result);
	}


}

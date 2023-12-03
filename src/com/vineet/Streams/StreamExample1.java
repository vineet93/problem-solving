package com.vineet.Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		
		
          
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
      
     boolean flag = list1.stream().allMatch(s-> s % 2 != 0);
     if(flag) {
    	 System.out.println("Sum of odd in stream is :"+list1.stream().reduce((x,y) -> x+y).get());
     }else {
    	 System.out.println("-1");
     }
     
     System.out.println("Max of stream is :"+list1.stream().max((x,y) -> x.compareTo(y)).get());
	 System.out.println("Min of stream is :"+list1.stream().min((x,y) -> x.compareTo(y)).get());
	 System.out.println("Count of even numbers in stream is :"+list1.stream().filter(s -> s%2 == 0).count());
	 System.out.println("Count of even numbers in stream is :"+list1.stream().filter(s -> s%2 != 0).collect(Collectors.counting()));

	}
  }

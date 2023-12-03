package com.vineet.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfSquareOfOddNumbers {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<Integer>();
		 
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
       
         Stream<Integer> stream = list.stream();
            Optional<Integer> num = stream.filter(p -> p%2!=0).map(p->p*p).reduce((x,y)->x+y);
            //oddlist.forEach(p-> System.out.println(p));
            System.out.println(num.get());

	}
}



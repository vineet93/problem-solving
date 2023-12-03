package com.vineet.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Test {

	public static void main(String[] args) {

		int n=10;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<n;i++) {
		
			list.add(i);
		}

	}
	

	private static void createEmpObj(int i) {
		
		System.out.println(new Employee(i, UUID.randomUUID().toString()));
		
	}

}

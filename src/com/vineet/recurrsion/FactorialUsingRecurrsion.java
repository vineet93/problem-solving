package com.vineet.recurrsion;

public class FactorialUsingRecurrsion {
	
	public static int factorial(int data) {
	
		if(data ==0) {
			return 1;
		}else {
			return (data * factorial(data-1));
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int num=8;
		int factorial = FactorialUsingRecurrsion.factorial(num);
		System.out.println("Factorial is :"+ factorial);
		
	}
}

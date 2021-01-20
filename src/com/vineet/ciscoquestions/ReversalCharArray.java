package com.vineet.ciscoquestions;

public class ReversalCharArray {
	
	public static void reverseWords(char[] arr, int start, int end) {
				
		       char temp;
		       
				while(start<=end) {
					temp = arr[start];
					arr[start]=arr[end];
					arr[end]= temp;
					start++;
					end--;
				}
				
	}
	
	
	public static void reverse(char[] arr) {
		
		int start =0;
		
		for (int i =0; i<arr.length;i++) {
			
			if(arr[i] == ' ') {
				ReversalCharArray.reverseWords(arr, start, i-1);
				start=i+1;
			}
		}
		
		ReversalCharArray.reverseWords(arr, start, arr.length - 1);
		 
		
		ReversalCharArray.reverseWords(arr, 0, arr.length - 1);
		

			System.out.print(arr);
			
	}

	public static void main(String[] args) {
		
		char[] arr = new char[]{'W','E',' ','A','R','E',' ','C','I','S','C','O'};
		ReversalCharArray.reverse(arr);
	}

}

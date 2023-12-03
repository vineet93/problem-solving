package com.vineet.segregateproblems;

public class SegregateZeroOneOptimized {
	
	
	
	
	public static void main(String args[]) {
	int[] arr= {1,0,1,1,0,0,1,0,0,1,1};
	SegregateZeroOneOptimized.segString(arr);
	}

	private static void segString(int[] arr) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		
		
		for(int i=count;i<arr.length;i++) {
			arr[i]=1;
		}
		
		for(int ar:arr) {
			System.out.print(ar+",");
		}
		
	}

}

package com.vineet.reversearray;

public class ReversalOfArray {
	
	public static void reverseArray(int arr[]) {
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		for( int k : arr) {
			System.out.print(k+",");
		}
	}
	

	public static void main(String[] args) {
		int[] arr =new int[]{2,4,7,5,9}; 
         ReversalOfArray.reverseArray(arr);
	}

}

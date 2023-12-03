package com.vineet.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6};
		int ele= 6;
		int result = searchElement(arr,ele);
		
		if(result == -1) {
			System.out.println("Element not present in the array");
		}else {
			System.out.println("Element present in the array");
		}

	}

	private static int searchElement(int[] arr, int ele) {
		
		int low = 0;
	    int high= arr.length-1; 
	   
	    
	    while(low<=high) {
	    	
	    	 //int mid= (low+high)/2;
			 int mid = low + (high-low)/2; //Optimised
	    	
	    	if(ele == arr[mid]) {
	    		return 0;
	    	}
	    	
	    	if(ele > arr[mid]) {
	    		low = mid+1;
	    	} else{
	    		high = mid-1;
	    	}
	    }
	    return -1;
	}

}

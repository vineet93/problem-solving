package com.vineet.sortingalgorithms;

public class BubbleSort {
	
	// optimized way for bubble sorting.
	public void bubbleSort(int arr[]){
		
		int n=arr.length;
		boolean swapped=false;
		int temp =0;
		for(int i=0;i<n-1;i++){
			swapped=false;
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
				temp = arr[j];
			    arr[j]=arr[j+1];
			    arr[j+1]=temp;
			    swapped=true;
				}
			  }
			if(swapped == false){
				break;
			}
		}
	}
	
 public void bubbleSort1(int arr[]){
		
		int n=arr.length;
		int temp =0;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
				temp = arr[j];
			    arr[j]=arr[j+1];
			    arr[j+1]=temp;
				}
			}
		}
	}
	
	 void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    }

	public static void main(String[] args) {
		
		int[] arr={12,23,34,1,22,10};
		BubbleSort sort= new BubbleSort();
		sort.bubbleSort(arr);
		//sort.bubbleSort1(arr);
		System.out.println("Sorted Array");
		sort.printArray(arr);

	}

}

package com.vineet.sortingalgorithms;

public class SelectionSort {
	
	public void sort(int arr[]){
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++){
			int minIndex=i;
			for(int j=i+1;j<n;j++)
				if(arr[minIndex]>arr[j] )
					minIndex=j;
					
					int temp=arr[minIndex];
					arr[minIndex] = arr[i];
					arr[i]=temp;
				
			
		}
	}
	
	void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for(int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	
	public static int[] sortReturn(int arr[]) {
		
		int n= arr.length;
		
		for(int i=0;i<n-1;i++){
			
			 int minIndex=i;
			 for(int j=i+1;j<n;j++)
				if(arr[minIndex]>arr[j]){
					minIndex=j;
				}
				int temp =  arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
		}
		return arr;	
	}

	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort(); 
        int arr[] = {64,25,12,22,11}; 
        int arr1[] = sortReturn(arr);
        for (int i=0; i<arr1.length; ++i) 
            System.out.print(arr1[i] + " "); 
        //ob.sort(arr); 
        //System.out.println("Sorted array"); 
        //ob.printArray(arr); 
        
        

	}

}

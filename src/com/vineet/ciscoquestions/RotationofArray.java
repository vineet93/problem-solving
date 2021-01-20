package com.vineet.ciscoquestions;

public class RotationofArray {
	
	public static void rotateArray(int arr[],int index) {
		
		if(arr.length == 0)
			System.out.println("No elements in array");
		
		for(int i=0;i<index;i++)
		{
			int j,temp; 
	        temp = arr[0]; 
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		
		for(int ar:arr) {
			System.out.print(ar);
		}
	}
	
	

	public static void main(String[] args) {
		//int[] arr = new int[] {2,3,8,5,1,9};
		int[] arr = new int[] {1,2,3,4,5};
		int index =2;
        RotationofArray.rotateArray(arr,index);
	}

}

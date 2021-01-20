package com.vineet.test;




public class Test2 {
	
	public static void segString(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] != arr[j]) {
					continue;
				}else {
					int temp=arr[j];
					arr[j]=arr[i+1];
					arr[i+1]=temp;
					break;
				}
			}
		}
		
		for(int x : arr) {
			System.out.print(x+",");
		}
	}
	
	public static void main(String args[]) {
	int[] arr= {1,0,1,1,0,0,1,0,0,1,1};
	 Test2.segString(arr);
	}
}

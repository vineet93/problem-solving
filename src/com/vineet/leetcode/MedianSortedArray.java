package com.vineet.leetcode;

public class MedianSortedArray {

	public static void main(String[] args) {
		int[] arr1= new int[]{1,2};
		int[] arr2= new int[]{3,4};
		
		
		double median=findMedian(arr1,arr2);
		System.out.println("Median is :"+ median);

	}

	private static double findMedian(int[] arr1, int[] arr2) {
		
		int[] arr3= new int[arr1.length + arr2.length];
		int n1=arr1.length;
		int n2= arr2.length;
		int n3= n1+n2;
		int mid =0;
		double median=0.0;
		
		mergeSortedArrays(arr1,arr2,n1,n2,arr3);
		
		if(n3%2==0) {
			mid = n3/2;
			median= (arr3[mid-1] +arr3[mid])/2.0;
		}else {
			mid = n3/2;
			median = arr3[mid];
		}
		
		return median;
	}

	private static void mergeSortedArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		
		int i=0,j=0,k=0;
		
		while(i<n1 && j<n2) {
			
			if(arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			}else {
				arr3[k++] = arr2[j++];
			}
		}
		
		while(i<n1)
			arr3[k++] = arr1[i++];
		
		while(j<n2)
			arr3[k++] = arr2[j++];
		
		

	}

}

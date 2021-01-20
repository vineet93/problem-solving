package com.vineet.largestcontinuoussum;

public class MaxSumArray {

	public static void main(String[] args) {
		
		int[] arr= {2,1,5,1,3,7};
		int k=2;
		int maximumSum = MaxSumArray.findMaxSum(arr,k);
		System.out.println("Max Sum is " + maximumSum);
		

	}
	
	public static int findMaxSum(int[] arr,int n) {
		
		int maxSum=0;  
		int currentMax;
		
		for (int i = 0; i <= arr.length - n; i++) {
			currentMax = 0;
		      for (int j = i; j < i + n; j++) {
		    	  currentMax += arr[j];
		      }
		      maxSum = Math.max(maxSum, currentMax);
		    }
	return maxSum;

}
}


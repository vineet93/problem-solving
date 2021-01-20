package com.vineet.largestcontinuoussum;

public class LargestContinuousSum {

	public static void main(String[] args) {
	
		int arr[] = {1,2,-1,3,4,10,10,-10,-1};
		int largestSum = checkLargestSum(arr);
      System.out.println(largestSum);
	}

	private static int checkLargestSum(int array[]) {
		int currentSum;
		int maxSum;
		maxSum=currentSum=array[0];
		
		for(int i=1;i<=array.length-1;i++){
			currentSum=Math.max((currentSum+array[i]), array[i]);
			maxSum=Math.max(currentSum, maxSum);
		}
         
		return maxSum;
	}
}

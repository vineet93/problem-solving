package com.vineet.ciscoquestions;

public class MaxProfitProblem {
	
	public static int findMaxProfit(int arr[]) {
		
		if(arr.length == 0)
			return -1;
		
		int min=arr[0];
		int maxProfit=0;
		int i=0;
		int j=0;
		
		while (i<arr.length) {
			if(min > arr[i]) {
				min=arr[i];
				i++;
			}else {
				if(arr[i] - min > maxProfit) {
				maxProfit =arr[i] - min;
				}
				i++;
			}
		}
		
		return maxProfit;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[] {3,2,9,4,10};
		int max = MaxProfitProblem.findMaxProfit(arr);
		System.out.println("Max Profit is :"+max);

	}

}

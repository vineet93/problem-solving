package com.vineet.largestcontinuoussum;

public class SmallestSubArray {

	public static void main(String[] args) {
		
		int[] arr= {2,1,5,3,8,2};
		int k=7;
		int subArraylength = SmallestSubArray.findSmallestSubArray(arr,k);
		System.out.println("Length of smallest Sub Array is " + subArraylength);

	}
	
	public static int findSmallestSubArray(int[] arr,int k) {
		
		int windowSum = 0, minLength = Integer.MAX_VALUE;
	    int windowStart = 0;
	    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
	      windowSum += arr[windowEnd]; // add the next element
	      // shrink the window as small as possible until the 'windowSum' is smaller than 'S'
	      while (windowSum >= k) {
	        minLength = Math.min(minLength, windowEnd - windowStart + 1);
	        windowSum -= arr[windowStart]; // subtract the element going out
	        windowStart++; // slide the window ahead
	      }
	    }
		
	return minLength == Integer.MAX_VALUE ? 0 : minLength;

}

}

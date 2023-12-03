package com.vineet.test;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {

//		int[] n1 = {1, 2, 3, 4, 5};
//		int[] n2 = {2, 5, 6, 7, 8, 9, 10};

		int[] n1 = {1,2,3,0,0,0};
		int[] n2 = {2,5,6};

		int m = 3;
		int n = 3;

		Test3 t = new Test3();
		t.merge(n1, m, n2, n);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int i=0;
		int j=0;
		int k=0;

		int[] nums3 = new int[m+n];
		int count = nums3.length-1;

		while(count > 0){
			if(nums1[i] > nums2[j]){
				nums3[k] = nums2[j];
				k++;
				j++;
			} else if(nums1[i] < nums2[j]){
				nums3[k] = nums1[i];
				k++;
				i++;
			} else {
				nums3[k] = nums1[i];
				nums3[k+1]= nums2[j];
				k = k+2;
				i++;
				j++;
				count--;
			}

			if(i==m){
				for(int f=k;f<nums3.length;f++){
					nums3[f] = nums2[j];
					j++;
					count--;
				}
			}else if(j==n) {
				for (int f = k; f < nums3.length; f++) {
					nums3[f] = nums1[i];
					i++;
					count--;
				}
			}
			count--;
		}

		System.out.println(Arrays.toString(nums3));
	}



	// Solution 2 for merging to sorted array in same array


/*	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		int pMerge = m + n - 1;

		while (p2 >= 0) {
			if (p1 >= 0 && nums1[p1] > nums2[p2]) {
				nums1[pMerge--] = nums1[p1--];
			} else {
				nums1[pMerge--] = nums2[p2--];
			}
		}

		System.out.println(Arrays.toString(nums1));
	}*/
}

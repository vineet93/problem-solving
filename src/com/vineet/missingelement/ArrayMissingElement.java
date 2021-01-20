package com.vineet.missingelement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayMissingElement {
	
	public Integer findElement(int arr1[],int arr2[]){
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	
		int temp[] = null;
		int temp1[] = null;
		int lastEle = 0;
		
		//Set<Integer> s= new HashSet<Integer>();
		if(arr1.length < arr2.length){
			temp = arr2;
			temp1 = arr1; 
		}else{
			temp = arr1;
			temp1 = arr2;
		}
		
		
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp1.length;j++){
				
				if(arr1[i]==arr2[j]){
					i++;
					continue;
				}else{
					if(arr1[i] < arr2[j]){
						return arr1[i];
						
					}else{
						return arr2[j];
					}
				}
			}
			lastEle = temp[i];
		}
		return lastEle;
		
		
	}

	public static void main(String[] args) {
		
		int arr1[]={5,5,3,7,9,7,8};
		int arr2[]={5,3,5,7,7,8};
		
		ArrayMissingElement check = new ArrayMissingElement();
		
		Integer missingElement=check.findElement(arr1, arr2);
		System.out.println("Missing Element is :"+missingElement); 
		

	}

}

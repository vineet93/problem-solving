	package com.vineet.missingelement;

public class ArrayMisEleUsingXor {
	
	static int getMissingNo(int a[], int b[]) 
    { 
        int x1 = a[0]; 
        int x2 = b[0]; 
  
        /* For xor of all the elements  
           in array */
        for (int i = 1; i < a.length; i++) 
        	x1 = x1 ^ a[i]; 
  
        /* For xor of all the elements  
           from 1 to n+1 */
        for (int i = 1; i < b.length; i++) 
            x2 = x2 ^ b[i]; 
  
        return (x1 ^ x2); 
    } 
  
    /* program to test above function */
    public static void main(String args[]) 
    { 
        int a[] = { 5,5,7,7}; 
        int b[] = { 5,7,7};
        int miss = getMissingNo(a, b); 
        System.out.println(miss); 
    } 

}

package com.vineet.permutationCombination;

public class PermutatuinCombination {

	public static void main(String[] args) {
		
		String str = "abc";
		String ans="";
		printPermutationCombination(str,ans);
		
		

	}

	private static void printPermutationCombination(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.print(ans + " "); 
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			
			char ch =str.charAt(i);
			
			String ros = str.substring(0, i) +  
                    str.substring(i + 1); 
			
			printPermutationCombination(ros,ans+ch);
		}
		
	}

}

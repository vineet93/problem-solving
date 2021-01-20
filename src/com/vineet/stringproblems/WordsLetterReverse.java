package com.vineet.stringproblems;

public class WordsLetterReverse {
	
	public static void reverseLetter(String str){
		
		String[] stringArr=str.split(" ");
		
		String reversedString="";
		
		for(int i=stringArr.length-1;i>=0;i--){
			if(stringArr[i].equalsIgnoreCase("")){ 
				continue;							// for removing in between spaces.
			}else{
				String word= stringArr[i];
				String reverseWord="";
				for (int j = word.length()-1; j >= 0; j--) 
				   {
					reverseWord = reverseWord + word.charAt(j);
				   }
				reversedString = reversedString + reverseWord + " ";
			}
		}
		System.out.println(reversedString);
	}
	

	public static void main(String[] args) {
		
		String str = "Love you     Jhon  snow";
		WordsLetterReverse.reverseLetter(str);

	}

}

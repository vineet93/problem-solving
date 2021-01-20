package com.vineet.stringproblems;

public class WordsReversal {
	
	public static String revWords(String s){
		String[] rev = s.split(" "); 
	
		// String[] rev = Split(s);
		 String ans="";
		 
		 for(int i=rev.length-1;i>=0;i--){
			 if(rev[i].equalsIgnoreCase("")){
				 continue;
			 }else{
				 ans +=rev[i]+" ";
			 }
		 }
		
		return ans;
	}
	
//	public static String[] Split(String s){
//		
//		String[] str = new String[s.length()];
//		
//		for(int i=0;i<=s.length();i++){
//			str[i]= "";
//		}
//		
//		return str;
//	}

	public static void main(String[] args) {
		String sentence="  i like this      program very much   ";
		String revString = WordsReversal.revWords(sentence);
		System.out.println(revString);
		System.out.println(revString.substring(0, revString.length() - 1)); 
	}

}

package com.vineet.anagramcheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnagramCheck {
	
	public boolean check(String str1,String str2){
		
		//boolean returnflag = false;
		str1=str1.replaceAll("\\s","").toLowerCase();
		str2=str2.replaceAll("\\s","").toLowerCase();
		
		System.out.println(str1 +" and other is "+ str2);
		
		//edge check
		if(str1.length() != str2.length()){
			return false;
		}
		
		char[] temp1 = str1.toCharArray();
		char[] temp2 = str2.toCharArray();
		
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		
		for(int i=0;i<=temp1.length-1; i++){
			if(temp1[i] != temp2[i])
			{
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		String S1="clint eastwood";
		String S2="old west action";
		
	 AnagramCheck ana = new AnagramCheck();
	 
	 System.out.println(ana.check(S1, S2));
	 

	}

}

package com.vineet.anagramcheck;

import java.util.HashMap;

public class AnagramCheckOptimized {

	public static void main(String[] args) {
		String S1="clint eastwood";
		String S2="old west action";

		AnagramCheckOptimized ana = new AnagramCheckOptimized();

		System.out.println(ana.check(S1, S2));

	}

	private boolean check(String s1, String s2) {



		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replaceAll("\\s", "").toLowerCase();

		if(s1.length() != s2.length())
			return false;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for(int i=0;i<s1.length();i++) {
			if(hm.keySet().contains(s1.charAt(i))) {

				hm.put(s1.charAt(i), hm.get(s1.charAt(i)) + 1);

			}else {
				hm.put(s1.charAt(i), 1);
			}
		}

		for(int j=0;j<s2.length();j++) {
			if(hm.keySet().contains(s2.charAt(j))) {

				hm.put(s2.charAt(j), hm.get(s2.charAt(j)) - 1);

			}else {
				return false;
			}
		}

		for(Integer val:hm.values()) {
			if(val!=0) {
				return false;
			}
		}
		return true;
	}

}

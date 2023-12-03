package com.vineet.Interviews.hackerrank;

import java.util.HashMap;
import java.util.stream.Stream;

public class Prudential {

	public static void main(String[] args) {
		String s="1102021";
		int k=2;
		int count = PerfectSubstring(s,k);
		System.out.println("Count of perfect substring is:"+count);
		
	}

	private static int PerfectSubstring(String s, int k) {
		
		int counterSubstring=0;
		for(int i=0;i<s.length();i++) {
			HashMap<Character, Integer> hm = new HashMap<>();
			int value =0;
			for(int j=i;j<s.length();j++) {
				boolean flag = true;
				if(hm.containsKey(s.charAt(j))) {
					hm.put(s.charAt(j), hm.get(s.charAt(j)) + 1);
					for(Integer val:hm.values()) {
						if(val != k) {
							flag = false;
							break;
						}
					}
					if(flag) {
						counterSubstring++;
					}
				}else {
					hm.put(s.charAt(j), value +1);
				}
			}
		}
		
				return counterSubstring;
	}

}

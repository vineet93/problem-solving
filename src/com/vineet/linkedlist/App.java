package com.vineet.linkedlist;

public class App {
	
	public static void main(String args[]) {
		
		List<Integer> list = new LinkedList<Integer>();
		list.insert(10);
		list.insert(2);
		list.insert(-9);
		list.insert(18);
		
		//System.out.print(list.size());
		list.traverseList();
		
	}
}

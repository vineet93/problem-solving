package com.vineet.linkedlistinterview;

public class Node {

	int data;
	Node next;
	Node(int d)
    {
        data = d;
        next = null;
    }
	
	@Override
	public String toString() {
		return Integer.toString(data);
	}
}

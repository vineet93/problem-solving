package com.vineet.ImplementationHashmap;

public class Entry {

	public Key key;
	public String value;
	Entry next;

	public Entry(Key k, String v) {
		key = k;
		value = v;
		next = null;
	}
}

package com.vineet.ImplementationHashmap;

public class MyOwnHashMapImpl {

	public static void main(String[] args) {

		MyOwnHashMap myMap = new MyOwnHashMap();
		myMap.put(new Key(7), "Red");
		myMap.put(new Key(6), "Blue");
		myMap.put(new Key(8), "Green");
		myMap.put(new Key(2), "violet");
		myMap.put(new Key(7), "black");
		System.out.println("Values Inserted by put");
		System.out.println("fetching  values by get");
		System.out.println(myMap.get(new Key(2)));
		System.out.println(myMap.get(new Key(17)));
		System.out.println(myMap.get(new Key(8)));
		System.out.println(myMap.get(new Key(6)));
		System.out.println(myMap.get(new Key(7)));

	}

}

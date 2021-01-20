package com.vineet.stack;

public class MyOwnStack {

	public static void main(String[] args) {
		MyOwnStackImpl s = new MyOwnStackImpl();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");

	}

}

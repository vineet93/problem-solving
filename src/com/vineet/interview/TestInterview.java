 package com.vineet.interview;

public class TestInterview {
	
	
public void work(){
	System.out.println("work parent");
}

public void run(){
	work();
	System.out.println("run parent");
}

public static void main(String[] args) {
	
	
	TestInterview t = new b();
	t.work();
	t.run();
}

}

class b extends TestInterview{
	
	
	public void work(){
		super.work();
		System.out.println("work child");
	}

	public void run(){
		super.run();
		System.out.println("run child");
	}
	
	
}



package com.vineet.Tutort.multithreading;

public class Test {
    public static void main(String[] args) {

        MultiThreadingExample mt = new MultiThreadingExample();
        Thread t = new Thread(mt);
        t.start();
        t.setName("Helper");
        System.out.println("Executed with Main Thread : " + Thread.currentThread().getName());
    }
}

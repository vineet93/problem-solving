package com.vineet.Tutort.multithreading;

class MultiThreadingExample implements Runnable{

    @Override
    public void run(){
        System.out.println("Executed with New Thread : " + Thread.currentThread().getName());
    }
}

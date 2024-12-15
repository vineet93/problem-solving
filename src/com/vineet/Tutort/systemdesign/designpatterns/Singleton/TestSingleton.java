package com.vineet.Tutort.systemdesign.designpatterns.Singleton;

public class TestSingleton {

    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance();
        System.out.println(obj.toString());
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.toString());

        // Check both the Objects should be equal.
        System.out.println(obj==obj2);
    }
}

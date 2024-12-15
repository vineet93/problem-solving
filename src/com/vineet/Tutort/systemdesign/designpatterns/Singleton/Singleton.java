package com.vineet.Tutort.systemdesign.designpatterns.Singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton(){};

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

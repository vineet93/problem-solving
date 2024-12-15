package com.vineet.Tutort.systemdesign.designpatterns.Factory;

abstract class Plan {
    protected double rate;
    public abstract void getRate();

    public void calculateBill(int unit){
        System.out.println(unit*rate);
    }
}

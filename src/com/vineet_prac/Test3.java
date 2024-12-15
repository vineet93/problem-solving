package com.vineet_prac;

import java.util.Arrays;
import java.util.List;

interface Interface1{

    default void m1(String input){
        System.out.println("default method Interface 1 value : " + input);
    }
}

interface Interface2{

    default void m1(String input){
        System.out.println("default method Interface 2 value : " + input);
    }
}

class Test3 implements Interface1,Interface2{



    @Override
    public void m1(String input) {
        Interface2.super.m1(input);
    }

    public static void main(String[] args) {

        Test3 t = new Test3();
        t.m1("calling Interface 1");

        List<Integer> list  = Arrays.asList(2,3,4,5,6,7,8);

        int sum = list.stream().filter(s->s%2==0).reduce((x,y) -> x+y).get();
        System.out.println(sum);
    }
}

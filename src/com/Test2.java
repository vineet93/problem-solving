package com;


abstract class Test5{

    Test5(){
        System.out.println("In Test5 constructor");
    }
}

class Test2 extends Test5{

    Test2(){
        System.out.println("Test2 constructor");
    }

    public static void main(String[] args) {

        Test2 t = new Test2();

    }
}


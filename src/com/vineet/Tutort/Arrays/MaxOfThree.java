package com.vineet.Tutort.Arrays;

public class MaxOfThree {

    public static void main(String[] args) {
        calcMax(10,20,30);
        calcMax(20,20,20);
        calcMax(50,20,10);
        calcMax(10,10,20);
    }

    private static void calcMax(int i, int i1, int i2) {


        // Using Ternary Operator Find the Max of Three Numbers
        // Way 1

        int max  =    (i > i1)  ? (i > i2 ? i : i2) : (i1 > i2 ? i1 : i2);
        System.out.println("Max is " + max);

        //using If Else Condition
        // Way 2
        int max1 = Integer.MIN_VALUE;
        if(i >= i1 && i >= i2){
            max1 = i;
        } else if(i1 >= i && i1 >=i2 ){
            max1 = i1;
        } else {
            max1 = i2;
        }

        System.out.println("MAX IF ELSE IS " + max1);
    }
}

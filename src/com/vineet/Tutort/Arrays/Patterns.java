package com.vineet.Tutort.Arrays;

public class Patterns {
    public static void main(String[] args) {
        int N=5;

        // 1. Decreasing Pattern
        for (int i=0 ; i < N ; i++){
            for (int j =0 ; j < N-i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Increasing Pattern

        // N=6
        // *        Horizontal -- Rows
        // **       Vertical   -- Col
        // ***
        // ****
        // *****
        // ******
        for(int i=0 ; i < N ; i++){
            for(int j=0 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//      3.) Increasing Number Pattern

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

        int count = 1;

        for(int i=0 ; i < N ; i++){
            for(int j=0 ; j <=i ; j++){

                System.out.print((count++)+" ");
            }
            System.out.println();
        }
    }
}

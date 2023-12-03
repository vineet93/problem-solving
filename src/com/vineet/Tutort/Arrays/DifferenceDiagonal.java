package com.vineet.Tutort.Arrays;


//https://www.hackerrank.com/challenges/diagonal-difference/problem
public class DifferenceDiagonal {
    public static void main(String[] args) {

        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {9,8,9}};

        System.out.println("Difference in Diagonal is : " + diagonalDifference(mat));
        System.out.println("Difference in Diagonal Optimised is : " + diagonalDifferenceOptimised(mat));
    }

    private static int diagonalDifference(int[][] mat) {

        int absDiff;
        int priDiag=0;
        int secDiag=0;

        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat[0].length ; j++){
                if(i == j){
                    priDiag += mat[i][j];
                }

                if( i+j==mat.length-1){
                    secDiag += mat[i][j];
                }
            }
        }

            absDiff = priDiag-secDiag;

        return Math.abs(absDiff);
    }


    private static int diagonalDifferenceOptimised(int[][] mat) {

        int absDiff;
        int priDiag=0;
        int secDiag=0;

        for(int i =0; i< mat.length;i++){
            priDiag += mat[i][i];
            secDiag += mat[i][mat.length-1-i];
        }

        absDiff = priDiag-secDiag;

        return Math.abs(absDiff);
    }
}

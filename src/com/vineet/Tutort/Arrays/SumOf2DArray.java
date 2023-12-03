package com.vineet.Tutort.Arrays;

public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        System.out.println(sumOfArray(mat));
    }

    public static  long sumOfArray(int[][] mat){

        long sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                sum += mat[i][j];
            }
        }

        return sum;
    }
}

package com.vineet.Tutort.Arrays;

public class Traverse2DArray {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};
        traverse2DArrays(mat);
    }

    static void traverse2DArrays(int[][] mat){

        int row = mat.length;
        int col = mat[0].length;

        System.out.println("Num of Row is : " +row+ " Num of Col is :"+col);

        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

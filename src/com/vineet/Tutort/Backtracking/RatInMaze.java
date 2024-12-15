package com.vineet.Tutort.Backtracking;

import java.util.ArrayList;

public class RatInMaze {

    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0},
                       {1, 1, 0, 1},
                       {1, 1, 0, 0},
                       {0, 1, 1, 1}};
        int n=4;
        System.out.println(findPath(arr,n));
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        boolean visited[][] = new boolean[n][n];
        helper(0,0,m,n,"",ans,visited);
        return ans;
    }

    private static void helper(int i,int j,int [][] m,int n, String path,ArrayList<String> ans,boolean visited[][]){
        if(i<0 || i>=n || j<0 || j>=n || m[i][j]==0 || visited[i][j]){
            return;
        }
        if(i==n-1 && j==n-1){
            ans.add(path);
            return;
        }

        visited[i][j] = true;
        helper(i+1,j,m,n,path+"D",ans,visited);
        helper(i-1,j,m,n,path+"U",ans,visited);
        helper(i,j-1,m,n,path+"L",ans,visited);
        helper(i,j+1,m,n,path+"R",ans,visited);
        visited[i][j] = false;
    }

}

package com.vineet.Tutort.DynamicProgramming;

public class Fabonacci {

    //https://leetcode.com/problems/fibonacci-number/description/
    public static void main(String[] args) {

        int n=4;
        System.out.println(fib(n));

    }

    public static int fib(int n) {

        if(n<=1) return n;

        int[] dp = new int[n+1];

        dp[0] =0;
        dp[1] =1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

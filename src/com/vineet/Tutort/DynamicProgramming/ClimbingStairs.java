package com.vineet.Tutort.DynamicProgramming;

//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {

    public static void main(String[] args) {

        int n =3;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if(n<=1) return n;

        int[] dp = new int[n+1];

        dp[0] =1;
        dp[1] =2;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}

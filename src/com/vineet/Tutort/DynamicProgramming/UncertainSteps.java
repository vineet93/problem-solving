package com.vineet.Tutort.DynamicProgramming;

public class UncertainSteps {

    public static void main(String[] args) {

        int input=6;
        System.out.println(solve(input));

    }

    public static int solve(int n)
    {

         int mod = 1000000007;

        int[] ans = new int[n+1];
        int i=0;
        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 4;
        
        int count=0;
        for (i=4; i<=n; i++)
        {
            if(count < 1) {
                ans[i] = ((ans[i - 3] % mod) + (ans[i - 2] % mod) + (ans[i - 1] % mod)) % mod;
                count++;
            }else{

                ans[i] = ((ans[i - 2] % mod) + (ans[i - 1] % mod)) % mod;
            }
        }
        return ans[n];
    }
}

package com.vineet.Tutort.recursion;

public class SumOfFirstNNumbers {

    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int sum1=0;
        int sum2=0;
        findSum(n,sum);
        findSumPrameterized(n,sum1);
        System.out.println(findSumFunctional(n));
    }

    public static void findSum(int n,int sum){
        if(n == 0)
            return;
        sum =sum+n;
        System.out.println(sum);
        findSum(n-1,sum);
        System.out.println(n);
    }

    public static void findSumPrameterized(int n,int sum){

        if(n<1){
            System.out.println(sum);
            return;
        }

        findSumPrameterized(n-1,sum+n);
    }

    public static int findSumFunctional(int n){

        if(n==0)
           return 0;

        return n + findSumFunctional(n-1);
    }
}

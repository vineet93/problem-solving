package com.vineet.Tutort.primequestions;

import java.util.Arrays;

public class SexyPrimes {
    public static void main(String[] args) {

        int N=10;
        int N1=20;
        System.out.println("Count of Sexy primes in : "+N+" is "+countSexyPrimesLessThanN(N));
        System.out.println("Count of Sexy primes in : "+N1+" is "+countSexyPrimesLessThanN(N1));

        int N3=35;
        int N4=14;
        System.out.println("Count of Sexy prime Factors in : "+N3+" is "+countSexyPrimeFactors(N3));
        System.out.println("Count of Sexy prime Factors in : "+N4+" is "+countSexyPrimeFactors(N4));

    }


    public static int countSexyPrimesLessThanN(int N) {

        int countSexyPrimes=0;

        //Create array of size N+1 + 6(for checking sexy prime)
        //If N=10, arr should be created of size 10+1+6 --> N+7
        boolean[] arr = new boolean[N+7];


        Arrays.fill(arr, true);

        for(int p=2;p*p<=N+6;p++){

            if(arr[p]){

                for(int i=p*p;i<=N+6;i+=p){
                    arr[i] = false;
                }
            }
        }

        for(int i=2;i<=N;i++){
            if(arr[i] && arr[i+6]){
                countSexyPrimes++;
                System.out.print(i+",");
            }
        }



        return countSexyPrimes;
    }

    public static int countSexyPrimeFactors(int N) {
        int countSexyPrimeFactors=0;

        //Create array of size N+1 + 6(for checking sexy prime)
        //If N=10, arr should be created of size 10+1+6 --> N+7
        boolean[] arr = new boolean[N+7];


        Arrays.fill(arr, true);

        for(int p=2;p*p<=N+6;p++){

            if(arr[p]){

                for(int i=p*p;i<=N+6;i+=p){
                    arr[i] = false;
                }
            }
        }

        for(int i=2;i<=N;i++){
            if(arr[i] && arr[i+6] && N%i==0){
                countSexyPrimeFactors++;
                System.out.print(i+",");
            }
        }



        return countSexyPrimeFactors;
    }

}

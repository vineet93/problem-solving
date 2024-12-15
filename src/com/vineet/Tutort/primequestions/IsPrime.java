package com.vineet.Tutort.primequestions;

public class IsPrime {
    public static void main(String[] args) {


        System.out.println(2 + " is Prime Number ..?? --> "+isPrime(2));
        System.out.println(10 + " is Prime Number ..?? --> "+isPrime(10));
        System.out.println(15 + " is Prime Number till half ..?? --> "+isPrimeTillHalf(15));
        System.out.println(17 + " is Prime Number till half..?? --> "+isPrimeTillHalf(17));
        System.out.println(25 + " is Prime Number till sqrt ..?? --> "+isPrimeTillHalf(25));
        System.out.println(29 + " is Prime Number till sqrt..?? --> "+isPrimeTillHalf(29));
    }

    // 1.) Check for All Numbers from 2 To N-1
    public static boolean isPrime(int n){ // Checking if the Number is Divisible by 1 and number itself
        for(int i=2;i<n;i++){ // checking from 2 to n-1 and there should not be any factors if the number is prime.
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
    // TC: O(N)
    // SC: (1)

    // 2.) Check for All Numbers from 2 to N/2
    public static boolean isPrimeTillHalf(int n){ // Checking if the Number is Divisible by 1 and number itself
        for(int i=2;i<=n/2;i++){ // If N is NOT a PRIME.Its Factor MUST lie between 2 to N/2
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
    // TC: O(N/2)
    // SC: (1)

    // 3.) Check for all Numbers from 2 to sqrt(N)

//          Euclid Theorem:
//        - Any Number if it does not have any factor till sqrt(N)
//        - It won't have any factor after

//              N = 10
//              sqrt(10) = 3.1868
//
//              2....3: 2 is a factor of 10 and 2 < sqrt(10)
//              - NOT PRIME
    public static boolean isPrimeTillSQRT(int n){ // Checking if the Number is Divisible by 1 and number itself
        for(int i=2;i*i<=n;i++){ // Any Number if it does not have any factor till sqrt(N).It won't have any factor after
            if(n%i == 0)
                return false;

        }

        return true;
    }
    // TC: O(logN)
    // SC: (1)



}

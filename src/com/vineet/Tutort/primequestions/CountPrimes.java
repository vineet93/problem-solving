package com.vineet.Tutort.primequestions;

//https://leetcode.com/problems/count-primes/
public class CountPrimes {
    public static void main(String[] args) {

        System.out.println("Number of primes till 10 : "+countPrimes(10));
        System.out.println("Number of primes till 2 : "+countPrimes(2));
        System.out.println("Number of primes till 20 : "+countPrimes(+20));

    }

    // 4.)  Seive of Eratosthenes -- Important theorem

    //    Eratosthenes: Mathematician
    //    Use Case: Find Prime Numbers between Range of Values: [L,R]
    public static int countPrimes(int N)
    {
        int count = 0;
        boolean[] prime = new boolean[N+1];

        for (int i=0; i<=N; i++)
            prime[i] = true;

        for (int p=2; p*p <=N; p++)
        // p = 2, p = 3
        {
            if (prime[p] == true)
            {
                for (int i=p*p; i<=N; i+=p)
                    // p = 2, i=4; i<=10; i+=2 : i = 4, i = 6, i = 8, i = 10
                    // p = 3, i = 9; i<=10; i+=3: i = 9
                    prime[i] = false;
            }
        }


        // Printing Prime Numbers from [2,N] - []: Both Inclusive
        // N+1 because of keeping index range, checking for N also
        for (int i =2; i<N; i++)
            if (prime[i] == true)
                ++count;

        return count;
    }

    // TC: O(N * log (log N))
    // SC: O(N)


}

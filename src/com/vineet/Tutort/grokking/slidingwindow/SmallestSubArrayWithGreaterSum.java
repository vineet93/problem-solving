package com.vineet.Tutort.grokking.slidingwindow;

public class SmallestSubArrayWithGreaterSum {
    public static void main(String[] args) {

        int[] nums={2, 1, 5, 2, 3, 2};
        int S=7;
        System.out.println(findMinSubArray(S,nums));
    }

    public static int findMinSubArray(int s, int[] a) {

        int windowSum=0;
        int windowStart=0;
        int minLength= Integer.MAX_VALUE;
        for(int windowEnd=0;windowEnd<a.length;windowEnd++){
            windowSum += a[windowEnd];

            while(windowSum >= s){
                minLength = Math.min(minLength, windowEnd-windowStart+1);
                windowSum -=a[windowStart];
                windowStart++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}

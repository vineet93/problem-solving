package com.vineet.Tutort.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/majority-element/

// 5 Possible Solution can be done for this problem

//        (1) Brute Force: Check freq > N/2, TC: O(N^2)
//        (2) Map: freq > N/2: TC: O(N)
//        (3) Sort and Check the value at arr[n/2]: TC: O(NlogN)
//        (4) Partial Sorting
//        (5) Bayer Moore Algo


public class MajorityElement1 {

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        int[] nums2 = {2,2,1,1,1,2,2};

        System.out.println("Majority Element is Sort and check : " + majorityElement(nums));
        System.out.println("Majority Element is Brute force: " + majorityElementBruteForce(nums2));
    }

    public static int majorityElement(int[] nums) {   // Approach: Sort and Check the value at arr[n/2]: TC: O(NlogN)

        int mE = nums.length / 2;
        Arrays.sort(nums);
        int ele = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (ele == nums[i]) {
                count++;
            } else {
                ele = nums[i];
                count = 1;
            }

            if (count > mE) {
               break;
            }
        }
        return  ele;
    }

    public static int majorityElementBruteForce(int[] arr) {
        int n = arr.length;
        int freq = 0;
        int ele =0;
        for (int i = 0; i < n; i++) {
            freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    ++freq;
            }

            if (freq > n / 2)
                ele = arr[i];
                break;
        }
        return ele;
    }


    public static int majorityElementOptimised(int[] nums) {              //Bayer Moore Algo
        // Theory: https://www.cs.utexas.edu/~moore/best-ideas/mjrty/
        // Bayer-Moore Algo
        // T - O(N), S- O(1)

        // IP: [3 2 3]
        // OP: 3

        int major = nums[0], count = 1;  // major : 3
        int i=1;
        int n = nums.length; // n = 3

        for (i=1; i<n; i++) // i =1, i = 2
        {
            // New Element -> Increase frequency from 0 -> 1
            if (count == 0)
            {
                ++count; // count = 1
                major = nums[i]; // major = nums[2] = 3
            }

            // Same Element -> Increase Frequency By 1
            else if (nums[i] == major) // nums[1] =2, major = 3
                ++count;

                // Different Element -> Decrease Frequency By 1
            else
                --count; // count = 0
        }

        return major; // 3 - ANS
    }
}

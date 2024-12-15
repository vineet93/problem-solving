package com.vineet.Tutort.stacks;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/
public class DailyTemperatures {

    public static void main(String[] args) {

        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int n = temperatures.length;
        int[] res = new int[n]; // [0 0 0 0]
        int idx = -1;

        for (i=0; i<n; i++) // L to R
        {
            // temp[0] < temp[1]: 30 < 40: TRUE
            // temp[1] < temp[2]: 40 < 50: TRUE
            // temp[2] < temp[3]: 50 < 60: TRUE
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i])
            {
                idx = stack.pop(); // idx = 0, idx = 1, idx = 2
                res[idx] = i - idx; // diff of indices
                // res[0] = 1 - 0 = 1 = [1 _ _ _ ]
                // res[1] = 2 - 1 = 1 = [1 1 _ _]
                // res[2] = 3 - 2 = 1 = [1 1 1 _]
            }

            stack.push(i); // s: [3: TOP]
        }

        return res; // [1 1 1 0]
    }
}

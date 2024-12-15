package com.vineet.Tutort.Arrays;

//https://leetcode.com/problems/next-greater-element-i/description/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {

    public static void main(String[] args) {

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};


        System.out.println("Using Stack Approach " +Arrays.toString(nextGreaterElementUsingStack(nums1,nums2)));

    }

    public static int[] nextGreaterElementUsingStack(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // Map for element and its immediate  next greater element.
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.empty() && stack.peek() < num) { // Pop elements from stack and update map with next greater element
                map.put(stack.pop(), num);
            }
            stack.push(num); // Push current element onto stack
        }
        for (int i = 0; i < nums1.length; i++) { // Check if each element in nums1 has a next greater element in map
            nums1[i] = map.getOrDefault(nums1[i], -1); // Update element in nums1 with next greater element or -1
        }
        return nums1;
    }
}

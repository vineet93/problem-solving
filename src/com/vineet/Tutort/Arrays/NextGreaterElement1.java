package com.vineet.Tutort.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {

    public static void main(String[] args) {

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        System.out.println("Brute Force Approach " +Arrays.toString(nextGreaterElement(nums1, nums2)));
        System.out.println("Using Stack Approach " +Arrays.toString(nextGreaterElementUsingStack(nums1, nums2)));

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];
        int temp;
        for (int i = 0; i < nums1.length; i++) {
            temp = -1;
            for (int j = 0; j < nums2.length; j++) {
                int k = j;
                if (nums1[i] == nums2[j]) {
                    while (k != nums2.length) {
                        if (nums2[k] > nums1[i]) {
                            temp = nums2[k];
                            break;
                        }
                        k++;
                    }
                }
            }
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] nextGreaterElementUsingStack(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // map for next greater element
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.empty() && stack.peek() < num) { // Pop elements from stack and update map with next greater element
                map.put(stack.pop(), num);
            }
            stack.push(num); // Push current element onto stack
        }
        for (int i = 0; i < nums1.length; i++) { // Check if each element in nums1 has a next greater element in map
            nums1[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1; // Update element in nums1 with next greater element or -1
        }
        return nums1;
    }
}

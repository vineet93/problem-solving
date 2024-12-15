package com.vineet.Tutort.Arrays;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums1 = {4,5,2,25};
        System.out.println("Brute Force : "+Arrays.toString(nextGreaterElement(nums1)));
        System.out.println("Using Stack : "+Arrays.toString(nextGreaterElementUsingStack(nums1)));
    }

    public static int[] nextGreaterElement(int[] nums1) {

        int[] arr = new int[nums1.length];
        Arrays.fill(arr,-1);

        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                if(nums1[j] > nums1[i]){
                    arr[i] = nums1[j];
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] nextGreaterElementUsingStack(int[] nums1) {

        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums1.length];
        int n = nums1.length;

        for(int i=n-1;i>=0;i--){ // 1. right to left

            while(!stack.isEmpty() && stack.peek()<=nums1[i]){ // 2. Here we are checking if the stack is not empty
                stack.pop();                                   // and top is less than the nums[i]. Then remove all
            }                                                  // the smaller values form stack till stack is empty
            // or the top is NGE.
            if(stack.isEmpty()){
                res[i] = -1;                  // 3. if empty put -1.
            }else{
                res[i] = stack.peek();       // 4. else put top element.
            }

            stack.push(nums1[i]);           // 5. everytime add element to stack.
        }

        return res;
    }
}

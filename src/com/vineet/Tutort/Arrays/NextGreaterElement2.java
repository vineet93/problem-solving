package com.vineet.Tutort.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class NextGreaterElement2 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] res = nextGreaterElements(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();


        for(int i=nums.length-1;i>=0;i--){
            stack.push(nums[i]);
        }

        for(int i=nums.length-1;i>=0;i--){
            int number=nums[i];
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();
            }

            nums[i]=stack.empty()?-1:stack.peek();
            stack.push(number);
        }

        return nums;

    }
}

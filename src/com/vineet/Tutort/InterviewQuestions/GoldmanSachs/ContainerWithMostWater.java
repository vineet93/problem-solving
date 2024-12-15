package com.vineet.Tutort.InterviewQuestions.GoldmanSachs;

//Given n non-negative integers a1, a2, …, an ,
// where each represents a point at coordinate (i, ai).
// n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
// Find two lines,which, together with the x-axis forms a container, such that the container
// contains the most water.
//Notice that you may not slant the container.

// Leetcode Premium Problem [LC-11] Container With Most Water

//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
// In this case, the max area of water (between 8 and 7 )the container can contain is 49
public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum Capacity of Container is : "+ maxArea(arr));
        System.out.println("Maximum Capacity of Container Optimised is : "+ maxAreaOptimised(arr));

    }

    public static int maxArea(int[] arr){

        int area=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++) {
                area = Math.min(arr[i], arr[j]) * (j - i);
                max = Math.max(area, max);
            }
        }
    return max;
    }

    public static int maxAreaOptimised(int[] arr){

        int left=0;
        int right = arr.length-1;
        int max=Integer.MIN_VALUE;

        while(left<right){

            int shortLine = Math.min(arr[left],arr[right]);
            max=Math.max(max,shortLine * (right-left));

            if(arr[left]<arr[right]){
                left++;
            }else {
                right--;
            }
        }
        return max;
    }
}

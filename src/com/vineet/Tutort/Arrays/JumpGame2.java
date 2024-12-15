package com.vineet.Tutort.Arrays;

public class JumpGame2 {
    public static void main(String[] args) {

        int[] nums ={2,1,1,1,4};
        System.out.println("Minimum steps required to reach end is " + jump(nums));

    }

    public static int jump(int[] nums) {
        int ans = 0;
        int end = 0;
        int farthest = 0;

        // Implicit BFS
        for (int i = 0; i < nums.length - 1; ++i) {
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                ++ans;
                break;
            }
            if (i == end) {   // Visited all the items on the current level
                ++ans;          // Increment the level
                end = farthest; // Make the queue size for the next level
            }
        }

        return ans;
    }
}

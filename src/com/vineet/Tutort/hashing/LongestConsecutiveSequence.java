package com.vineet.Tutort.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] nums = {1, 2 ,3 ,4 ,7 ,8 ,9, 10 ,11};
        System.out.println("Longest consecutive subset length is : " + longestConsecutive(nums));
        System.out.println("Longest consecutive subset length is : " + longestConsecutiveOptimised(nums));

    }

    public static int longestConsecutive(int[] nums) {

        if(nums.length == 0)
            return 0;

        int len = nums.length;
        int count =0;
        int curr_len=1;

        Arrays.sort(nums);

        for(int i=1;i<len;i++){

            if(nums[i] == nums[i-1]){ // if values are duplicates continue;
                continue;
            }else if(nums[i] == nums[i-1]+1){ // if values are in increasing order by 1 maintain counter curr_len.
                curr_len++;
            }else{  // Else find the max of count and curr_len and set curr_len to 1 because there might be a chance
                    // that longest consecutive subset can be in the next part of array.
                    // eg: in arr[1 2 3 4 7 8 9 10 11]
                    // OP: Max(4,5) = 5
                count = Math.max(count,curr_len);
                curr_len=1;
            }
        }

        return Math.max(count,curr_len);
    }

    public static int longestConsecutiveOptimised(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return 0;

        Set<Integer> set = new HashSet<>();

        for (int i: nums)
            set.add(i);

        int count = 0;
        for (int num: nums)
        {
            int left = num-1;
            int right = num+1;

            while(set.remove(left))
                left--;

            while(set.remove(right))
                right++;

            count = Math.max(count, right-left-1);

            if (set.isEmpty())
                return count;
        }
        return count;
    }
}

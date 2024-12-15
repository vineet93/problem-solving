package com.vineet.Tutort.Arrays;

import java.util.*;

public class NumbersDisappeared {

    public static void main(String[] args) {

        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] visited = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            visited[nums[i]] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!visited[i]) ans.add(i);
        }
        return ans;


    }
}

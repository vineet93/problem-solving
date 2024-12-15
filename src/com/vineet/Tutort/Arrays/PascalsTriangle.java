package com.vineet.Tutort.Arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/  -- Doubt
public class PascalsTriangle {

    public static void main(String[] args) {
        int n=6;
        List<List<Integer>> ans=generate(n);
        ans.stream().forEach(s-> System.out.println(s));
    }

        public static List<List<Integer>>  generate(int n) {

            List<List<Integer>> ans = new ArrayList<>();

            ArrayList<Integer> one,pre,row;

            one = new ArrayList<>();
            one.add(1);
            ans.add(one);

            if(n==1){
              return ans;
            }

            pre= new ArrayList<>();
            pre.add(1);
            pre.add(1);
            ans.add(pre);

            if(n==2){
                return ans;
            }

            for(int i=2 ;i<n;i++){
                row = new ArrayList<>();
                row.add(1);
                for(int j =0 ;j<pre.size()-1;j++){
                    row.add(pre.get(j) + pre.get(j+1));
                }
                row.add(1);
                ans.add(row);
                pre=row;
            }
            return ans;
        }
}

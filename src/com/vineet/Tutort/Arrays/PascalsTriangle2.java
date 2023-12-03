package com.vineet.Tutort.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

    public static void main(String[] args) {
        int n=3;
        List<Integer>  ans = getRow(n);
        System.out.println(ans);
    }

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<>();;

        ArrayList<Integer> one,pre,row;

        one = new ArrayList<>();
        one.add(1);

        if(rowIndex==0){
            return one;
        }

        pre= new ArrayList<>();
        pre.add(1);
        pre.add(1);

        if(rowIndex==1){
            return pre;
        }

        for(int i=1 ;i<rowIndex;i++){
            row = new ArrayList<>();
            row.add(1);
            for(int j =0 ;j<pre.size()-1;j++){
                row.add(pre.get(j) + pre.get(j+1));
            }
            row.add(1);
            if(i == rowIndex-1){
                return row;
            }
            pre=row;
        }
        return ans;
    }
}

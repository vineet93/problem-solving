package com.vineet.arraypairsum;

import java.util.HashSet;

public class ArrayPairSum {

    public static void main(String[] args) {

        int[] arr={1,4,5,3,2};
        int target=5;
        String pair="";
        HashSet<Integer> setMain = new HashSet<Integer>();
        HashSet<String> setOutput = new HashSet<String>();

        for(int i=0;i<arr.length;i++){
            setMain.add(arr[i]);
        }

        for(Integer number : setMain){ // O(n)
            int sub= target - number;
            if(setMain.contains(sub)){ // O(1)
                setOutput.add(Math.min(number,sub)+","+Math.max(number,sub));
             //pair ="("+ number +","+sub+")";
            }
            }

            for(String out: setOutput){
             System.out.println(out);
            }
        }

    }


package com.vineet.Tutort.Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class MaxProfit2 {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = MaxProfit2.maxProfit(prices);
        System.out.println("Max Profit is : "+ result);
    }

    public static int maxProfit(int[] prices) {

        int maxProfit =0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}

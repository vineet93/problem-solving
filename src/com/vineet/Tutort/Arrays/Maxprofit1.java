package com.vineet.Tutort.Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Maxprofit1 {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int result = Maxprofit1.maxProfit(prices);
        System.out.println("Max Profit is : "+ result);
    }

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int buy = prices[0];
        for (int i=1; i<prices.length;i++){
            if( buy > prices[i]){
                buy = prices[i];
            } else if(prices[i] - buy > maxProfit){
                maxProfit = prices[i] - buy;
            }
        }

        return maxProfit;
    }
}

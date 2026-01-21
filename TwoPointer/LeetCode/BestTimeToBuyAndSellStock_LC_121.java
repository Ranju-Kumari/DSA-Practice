package dsa_learning.TwoPointer.LeetCode;

public class BestTimeToBuyAndSellStock_LC_121 {

    public static void main(String [] args){
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int [] prices){

        int minPrice=Integer.MAX_VALUE;
        int profit=0, maxProfit=0;

        for(int i=0;i<=prices.length-1;i++){
            //Finding the minimum buying price from the array.
            // To do that: Firstly, check if current element is less than the set minimum price,
            // then udate the 'minPrice' value. If the current element's value is greater then the 'minPrice',
            // then don't update anything in 'minPrice'.
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            //Now, subtract the minPrice value from the current element to get the profit.
            profit = prices[i]-minPrice;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}

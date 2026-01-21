package dsa_learning.Arrays.Leetcode;

public class BestTimeToBuyAndSellStock_Leetcode_121 {

    public static void main(String [] args){

        int [] nums = {7,1,5,3,6,4};
        System.out.println(maxPrice(nums));
    }

    public static int maxPrice(int [] prices){

        int profit=0;
        int maxProfit=0;

        for(int i =0; i<=prices.length-1;i++){
            for(int j=i+1;j<=prices.length-1;j++){
                if(prices[j]-prices[i]>0){
                    profit=prices[j]-prices[i];
                    maxProfit = Math.max(profit, maxProfit);
                }
            }
        }
        return maxProfit;
    }

    //Another approach
    // TODO: This solution works for small inputs as it is in O(n*n)
    public int maxProfit(int[] prices) {
        int profit=0;
        int maxProfit=0;

        // TODO: This solution works for small inputs as it is in O(n*n), needs better time complexity like O(n*logn)
        for(int i =0; i<=prices.length-1;i++){
            for(int j=i+1;j<=prices.length-1;j++){
                if(prices[j]-prices[i]>0){
                    profit=prices[j]-prices[i];
                    maxProfit = Math.max(profit, maxProfit);
                }
            }
        }
        return maxProfit;
    }
}

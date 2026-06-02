// Stock Buy And Sell



// Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Examples
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.

// Sol:Algorithm
// We try every possible pair of days (buy day and sell day after buy) and calculate the profit. The maximum profit among all these pairs is our answer. If no profit is possible, return 0.
// Loop through all days to consider each as a possible buy day.
// For each buy day, loop through all future days to consider them as sell days.
// Calculate the profit for each (buy, sell) pair.
// Track the maximum profit seen.
class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int maxprofit=0;
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
            int cost=prices[i]-mini;
            maxprofit=Math.max(maxprofit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return maxprofit;
    }
        public static void main(String[] args) {
            int[] prices = {7, 1, 5, 3, 6, 4};
            BuyAndSellStock sol = new BuyAndSellStock();
            System.out.println("Maximum profit is: " + sol.maxProfit(prices));
        
    }
}
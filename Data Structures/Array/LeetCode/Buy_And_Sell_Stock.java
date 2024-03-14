package LeetCode;

public class Buy_And_Sell_Stock {

    public static int buyAndSellStock(int[] prices) { // Didi's approach
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int maxProfit = prices[i] - buyPrice; // today's profit
                profit = Math.max(maxProfit, profit); // maximum profit possible
            } else { // minimum buy price
                buyPrice = prices[i];
            }
        }
        if (profit != 0) // in case of profit more than 0
            return profit;
        else // in case of 0 profit
            return 0;
    }
}
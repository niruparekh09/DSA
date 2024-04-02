public class ArrayOperations {

    public static int buyNSellStock(int[] prices) { // My approach
        // brute force
        int minPrice = Integer.MAX_VALUE, index = 0, maxprice = Integer.MIN_VALUE, profit = 0;
        // getting minimum of price
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
                index = i + 1;
            }
        }
        // checking highest price after minprice
        for (int i = index; i < prices.length; i++) {
            if (maxprice < prices[i])
                maxprice = prices[i];
        }

        if (maxprice != 0) {
            profit = maxprice - minPrice;
            return profit;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyNSellStock(prices));
    }
}

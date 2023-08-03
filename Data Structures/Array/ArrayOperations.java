import java.util.*;

public class ArrayOperations {

    public static void reverse(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first <= last) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++; // index aage bhadega
            last--; // index peeche jayega
        }
    }

    public static void pairsInArray(int arr[]) {
        int tp = 0; // (n*(n+1))/2

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(arr[i] + "," + arr[j] + " ");
                tp++;
            }
            System.out.println("");
        }
        System.out.println("Total number of pairs are: " + tp);
    }

    public static void subArrays(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0; // the sum needs to initialised to 0 all the time new iteration starts
                for (int k = start; k <= end; k++) {
                    // add all the elements in sub array
                    currSum += arr[k];
                }
                System.out.println("Current sum in every iteration: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum: " + maxSum);
    }

    public static void prefixSumSubArrays(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];// if start is 0
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum: " + maxSum);
    }

    public static void kadanesAlgoSumSubArrays(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int smallestnegative = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0)
                cs = 0;

            ms = Math.max(cs, ms); // will compare if(cs>ms) them ms = cs

            // For totally negative array
            if (arr[i] < 0) {
                /*
                 * between the smallest negative number and MIN_VALUE, max will be smallest
                 * negative number
                 */
                smallestnegative = Math.max(smallestnegative, arr[i]);
            }
            if (ms == 0)
                ms = smallestnegative;
        }
        System.out.println("Maximum sum of sub array is: " + ms);
    }

    public static int trappedRainWater(int[] height) {
        int n = height.length;
        // Calculate left max boundary
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        // Initializing leftMax auxilary array
        for (int i = 1; i < n; i++) {
            // Comparing current height with height of previous(left) max boundary
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate left max boundary
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        // Initializing rightMax auxilary array
        for (int i = n - 2; i >= 0; i--) {
            // Comparing current height with height of next(right) max boundary
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        int trappedRainWater = 0;
        for (int i = 0; i < n; i++) {
            // Water level = min(lmb,rmb)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // Trapped Water = WL-Height[i]
            trappedRainWater += waterLevel - height[i];
        }

        return trappedRainWater;
    }

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

    public static void main(String args[]) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStock(prices));
    }
}

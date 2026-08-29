package arrays;

public class P05BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        // If the array is empty, we can't make any profit
        if (prices == null || prices.length == 0) {
            return 0;
        }

        // Keep track of the lowest price we've seen so far
        int minPrice = prices[0];
        // Keep track of the highest profit we can make
        int maxProfit = 0;

        // Loop through the prices day by day
        for (int i = 1; i < prices.length; i++) {
            
            // If today's price is lower than our minPrice, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Otherwise, check if selling today gives us a better profit
            else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test 1 (Expected 5): " + maxProfit(prices1));

        // Test Case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Test 2 (Expected 0): " + maxProfit(prices2));
    }
}

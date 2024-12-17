public class BestTimeBuyAndSellStockVer2 {
    /**
     * <b>Example 1:</b><br>
     *
     * Input: prices = [7,1,5,3,6,4]<br>
     * Output: 7<br>
     * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.<br>
     * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.<br>
     * Total profit is 4 + 3 = 7.<br>
     * <br><b>Example 2:</b><br>
     *
     * Input: prices = [1,2,3,4,5]<br>
     * Output: 4<br>
     * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.<br>
     * Total profit is 4.<br>
     * <br><b>Example 3:</b><br>
     *
     * Input: prices = [7,6,4,3,1]<br>
     * Output: 0<br>
     * Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.<br>
     */
    public static int maxProfit(int... prices) {
        int left = 0;
        int maxP = 0;

        for (int right = 1; right < prices.length; right++) {
            if (prices[right] > prices[left]) {
                maxP += (prices[right] - prices[left]);
                prices[left] = prices[right];
            } else {
                left = right;
            }
        }

        return maxP;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(7, 6, 4, 3, 1));
    }
}

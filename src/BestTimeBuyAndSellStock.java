public class BestTimeBuyAndSellStock {
    /**
     *<b>Example 1: </b><br>
     *
     * Input: prices = [7,1,5,3,6,4]<br>
     * Output: 5<br>
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.<br>
     * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.<br> <br>
     *
     *<b>Example 2:</b><br>
     *
     * Input: prices = [7,6,4,3,1]<br>
     * Output: 0<br>
     * Explanation: In this case, no transactions are done and the max profit = 0.<br>
     */
    public static int maxProfit(int... nums) {
        int left = 0;
        int maxP = 0;

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] > nums[left]) {
                int profit = nums[right] - nums[left];
                maxP = Integer.max(profit, maxP);
            } else {
                left = right;
            }
        }

        return maxP;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(1, 2));
    }
}

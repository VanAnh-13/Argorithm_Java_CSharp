public class MinimumSizeSubarray {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindows = Integer.MAX_VALUE;
        int sum = 0;
        int low = 0;
        int high = 0;

        while(high < nums.length) {
            sum += nums[high++];

            while(sum >= target) {
                int window = high - low;
                minWindows = Integer.min(window, minWindows);

                sum -= nums[low++];
            }
        }

        return minWindows == Integer.MAX_VALUE ? 0 : minWindows;
    }
}

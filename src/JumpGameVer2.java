public class JumpGameVer2 {
    /**
     * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
     * Each element nums[i] represents the maximum length of a forward jump from index i.
     * In other words, if you are at nums[i], you can jump to any nums[i + j] where:<br>
     * 0 <= j <= nums[i] and
     * i + j < n
     * <br>Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].</br><br>
     *
     * <b>Example 1:</b>
     * <br>Input: nums = [2,3,1,1,4]</br>
     * Output: 2
     * <br>Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.</br><br>
     * <b>Example 2:</b>
     *
     * <br>Input: nums = [2,3,0,1,4]</br>
     * Output: 2
     */
    public static int jump(int... nums) {
        int l = 0;
        int r = 0;
        int count = 0;

        while (r < nums.length - 1) {
            int destination = 0;

            for (int i = l; i <= r; i++) {
                destination = Integer.max(destination, i + nums[i]);
            }

            l = r + 1;
            r = destination;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(jump(1, 2, 3, 4, 5, 6));
    }
}

public class JumpGame {
    /**
     *<b>You are given an integer array nums. You are initially positioned at the array's first index,
     * and each element in the array represents your maximum jump length at that position. <br>
     *
     * <br>Return true if you can reach the last index, or false otherwise. <br></b>
     * <b><br>Example 1:<br></b>
     * Input: nums = [2,3,1,1,4]<br>
     * Output: true<br>
     * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.<br>
     *<br><br><b> Example 2:<br></b>
     * Input: nums = [3,2,1,0,4]<br>
     * Output: false<br>
     * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0,
     * which makes it impossible to reach the last index. -> write put tag <b> and tag <br> for new line and new header
     */
    public static boolean canJump(int... nums) {
       int goal = nums.length - 1;

        for (int i = nums.length- 1; i > - 1 ; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
    }

    public static void main(String[] args) {
        System.out.println(canJump(2,0));
    }
}

public class RemoveElement {
    /**
     * <b>Example 1:</b><br>
     *
     * Input: nums = [3,2,2,3], val = 3 <br>
     * Output: 2, nums = [2,2,_,_]<br>
     * Explanation: Your function should return k = 2, with the first two elements of nums being 2.<br>
     * It does not matter what you leave beyond the returned k (hence they are underscores).<br>
     * <br><b>Example 2:</b><br>
     *
     * Input: nums = [0,1,2,2,3,0,4,2], val = 2<br>
     * Output: 5, nums = [0,1,4,0,3,_,_,_]<br>
     * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.<br>
     * Note that the five elements can be returned in any order.<br>
     * It does not matter what you leave beyond the returned k (hence they are underscores)<br>
     */
    public static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
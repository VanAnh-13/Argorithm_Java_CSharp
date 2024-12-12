public class MergeSortedArray {
    /**
     * <b>Example 1:</b><br>
     *
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3<br>
     * Output: [1,2,2,3,5,6]<br>
     * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].<br>
     * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.<br><br>
     * <b>Example 2:</b><br>
     *
     * Input: nums1 = [1], m = 1, nums2 = [], n = 0<br>
     * Output: [1]<br>
     * Explanation: The arrays we are merging are [1] and [].<br>
     * The result of the merge is [1].<br><br>
     * <b>Example 3:</b><br>
     *
     * Input: nums1 = [0], m = 0, nums2 = [1], n = 1<br>
     * Output: [1]<br>
     * Explanation: The arrays we are merging are [] and [1].<br>
     * The result of the merge is [1].<br>
     * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.<br><br>
     *
     *
     */
    public static void merge(int[] nums1, int m, int[] num2, int n) {
        int m1 = m - 1;
        int n2 = n - 1;
        int k = m + n - 1;

        while (m1 >= 0 && n2 >= 0) {
            if (nums1[m1] >= num2[n2]) {
                nums1[k--] = nums1[m1--];
            } else {
                nums1[k--] = num2[n2--];
            }
        }

        while (n2 >= 0 && k >= 0) {
            nums1[k--] = num2[n2--];
        }

        while (m1 >= 0 && k >= 0) {
            nums1[k--] = nums1[m1--];
        }
    }
}
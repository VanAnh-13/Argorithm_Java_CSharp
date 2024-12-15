import java.util.Arrays;

public class RotateArray {
    /**
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     */
    public static void rotate(int[] nums, int k) {
       k = k % nums.length;
       revertArray(0, nums.length - 1, nums);
       revertArray(0, k - 1, nums);
       revertArray(k, nums.length - 1, nums);
    }

    public static void revertArray(int start, int end, int... nums) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}

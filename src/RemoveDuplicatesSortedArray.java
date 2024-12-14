import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    /**
     * Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.
     * Then return the number of unique elements in nums.
     * @param nums
     * @return length array after erase
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int tmp = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]){
                nums[tmp++] = nums[i + 1];
            }
        }

        return tmp;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,1,2};
        System.out.println(removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }
}

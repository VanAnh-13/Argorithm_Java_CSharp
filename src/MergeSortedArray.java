public class MergeSortedArray {
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
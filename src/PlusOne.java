import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int... digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(9, 9)));
    }
}

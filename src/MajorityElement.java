import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /**
     * Given an array nums of size n, return the element appears more than ⌊n / 2⌋ times.
     */
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> elementAppear = new HashMap<>();

        for (int element : nums) {
            elementAppear.put(element, elementAppear.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : elementAppear.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}

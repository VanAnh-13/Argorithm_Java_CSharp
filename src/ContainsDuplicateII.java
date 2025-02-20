import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> indicatesAndValues = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (indicatesAndValues.containsKey(nums[i]) && i - indicatesAndValues.get(nums[i]) <= k) {
                return true;
            }

            indicatesAndValues.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
    }
}

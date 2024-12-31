/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 */
public class TrappingRainWater {
    public static int trap(int... height) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];
        int result = 0;

        while (left < right) {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Integer.max(maxLeft, height[left]);
                result += maxLeft - height[left];
            } else {
                right--;
                maxRight = Integer.max(maxRight, height[right]);
                result += maxRight - height[right];
            }
        }

        return result;
    }
}

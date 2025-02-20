public class ContainMostWater {
    public int maxArea(int... height) {
        int left = 0, right = height.length - 1, result = 0;

        while (left < right) {
            int w = right - left;
            int h = Math.min(height[right], height[left]);
            result = Math.max(w * h, result);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}

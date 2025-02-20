using System;
using System.Text.RegularExpressions;

namespace Algorithm
{
    public class MinimumSizeSubarraySum
    {
        public int MinSubArrayLen(int target, int[] nums)
        {
            int left = 0, currentSum = 0, currentWindow = Int32.MaxValue;

            for (int right = 0; right < nums.Length; right++)
            {
                currentSum += nums[right];

                while (currentSum >= target)
                {
                    currentWindow = Math.Min(currentWindow, right - left + 1);
                    currentSum -= nums[left++];
                }
            }

            return currentWindow != Int32.MaxValue ? currentWindow : 0;
        }
    }
}
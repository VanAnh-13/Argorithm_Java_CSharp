using System;
using System.Collections.Generic;

namespace Algorithm
{
    public class ThreeSum
    {
        public IList<IList<int>> ThreeSumSolution(int[] nums)
        {
            if (nums.Length < 3)
            {
                return new List<IList<int>>();
            }

            Array.Sort(nums);

            HashSet<string> result = new HashSet<string>();
            List<IList<int>> resultOut = new List<IList<int>>();

            for (int i = 0; i < nums.Length - 2; i++)
            {
                int left = i + 1, right = nums.Length - 1;

                while (left < right)
                {
                    int threeSum = nums[i] + nums[left] + nums[right];

                    if (threeSum == 0)
                    {
                        string triplet = $"{nums[i]} {nums[left]} {nums[right]}";

                        if (result.Add(triplet))
                        {
                            resultOut.Add(new List<int>() { nums[i], nums[left], nums[right] });
                        }

                        right--;
                        left++;
                    }
                    else if (threeSum < 0)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }

            return resultOut;
        }
    }
}
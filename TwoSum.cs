namespace Algorithm
{
    public class FindTwoSum
    {
        public int[] TwoSum(int[] numbers, int target)
        {
            int right = numbers.Length - 1, left = 0;

            while (left < right)
            {
                int sum = numbers[left] + numbers[right];

                if (sum == target)
                {
                    return new int[] { left + 1, right + 1 };
                }

                if (sum < target)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }

            return null;
        }
    }
}
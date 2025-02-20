using System;
using System.Collections.Generic;

namespace Algorithm
{
    public class LongestSubstring
    {
        public int LengthOfLongestSubstring(string s)
        {
            int left = 0, currentWindow = 0;
            HashSet<char> characterCheck = new HashSet<char>();

            for (int right = 0; right < s.Length; right++)
            {
                while (characterCheck.Contains(s[right]))
                {
                    characterCheck.Remove(s[left]);
                    left++;
                }

                currentWindow = Math.Max(currentWindow, right - left + 1);
                characterCheck.Add(s[right]);
            }

            return currentWindow;
        }
    }
}
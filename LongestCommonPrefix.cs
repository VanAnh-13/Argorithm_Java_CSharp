using System;

namespace Algorithm
{
    public class LongestCommonPrefixSolution
    {
        public string LongestCommonPrefix(string[] strs)
        {
            if (strs.Length <= 0)
            {
                return "";
            }

            string compareString = strs[0];

            for (int i = 0; i < compareString.Length; i++)
            {
                char compareChar = compareString[i];

                for (int j = 1; j < strs.Length; j++)
                {
                    if (i >= strs[j].Length || compareChar != strs[j][i])
                    {
                        return compareString.Substring(0, i);
                    }
                }
            }

            return compareString;
        }
    }
}
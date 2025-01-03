using System;
using System.Linq;
using System.Text.RegularExpressions;

namespace Algorithm
{
    public class Solution
    {
        private  int LengthOfLastWord(string s)
        {
            return Regex.Replace(s.Trim(), @"\s+", " ").Split(' ').Last().Length;
        }
    }
}
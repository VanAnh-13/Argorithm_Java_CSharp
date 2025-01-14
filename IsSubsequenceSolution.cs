using System;
using System.Linq;

namespace Algorithm
{
    public class IsSubsequenceSolution
    {
        public bool IsSubsequence(string s, string t)
        {
            int indexMatch = -1;

            return s.Select(c => indexMatch = t.IndexOf(value: c, startIndex: indexMatch + 1))
                .All(i => i != -1);
        }
    }
}
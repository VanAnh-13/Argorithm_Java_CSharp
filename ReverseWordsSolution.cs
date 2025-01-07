using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace Algorithm
{
    public class ReverseWordsSolution
    {
        public string ReverseWords(string s)
        {
            s = s.Trim();
            s = Regex.Replace(s, @"\s+", " ");
            List<string> splitString = new List<string>(s.Split(' '));
            splitString.Reverse();
            
            return string.Join(" ", splitString);
        }
    }
}
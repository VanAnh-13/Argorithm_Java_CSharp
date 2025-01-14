using System.Text.RegularExpressions;

namespace Algorithm
{
    public class FindTheIndexOfString
    {
        public int StrStr(string haystack, string needle)
        {
            Match textMatch = Regex.Match(haystack, needle);
            return textMatch.Success ? textMatch.Index : -1;
        }
    }
}
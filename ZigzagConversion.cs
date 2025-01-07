using System.Text;

namespace Algorithm
{
    public class ZigzagConversion
    {
        public string Convert(string s, int numRows)
        {
            if (s.Length == 1)
            {
                return s;
            }

            string result = string.Empty;

            for (int i = 0; i < numRows; i++)
            {
                int increment = 2 * (numRows - 1);

                for (int j = i; j < s.Length; j += increment)
                {
                    result += s[j];

                    if (i > 0 && i < numRows - 1 && j + increment - 2 * i < s.Length)
                    {
                        result += s[j + increment - 2 * i];
                    }
                }
            }

            return result;
        }
    }
}
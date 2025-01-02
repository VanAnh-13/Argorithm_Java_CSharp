using System.Collections.Generic;


namespace Algorithm
{
    class RomanToInteger
    {
        public static int RomanToInt(string s)
        {
            Dictionary<char, int> roman = new Dictionary<char, int>()
            {
                {
                    'I', 1
                },
                {
                    'V', 5
                },
                {
                    'X', 10
                },
                {
                    'L', 50
                },
                {
                    'C', 100
                },
                {
                    'D', 500
                },
                {
                    'M', 1000
                }
            };

            int values = 0;

            for (int i = 0; i < s.Length; i++)
            {
                if (i + 1 < s.Length && roman[s[i + 1]] > roman[s[i]])
                {
                    values -= roman[s[i]];
                }
                else
                {
                    values += roman[s[i]];
                }
            }

            return values;
        }
    }
}
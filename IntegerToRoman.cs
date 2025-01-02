using System;
using System.Collections.Generic;
using System.Linq;

namespace Algorithm
{
    public class IntegerToRoman
    {
        private readonly Dictionary<string, int> _romanNumerals = new Dictionary<string, int>()
        {
            {
                "I", 1
            },
            {
                "IV", 4
            },
            {
                "V", 5
            },
            {
                "IX", 9
            },
            {
                "X", 10
            },
            {
                "XL", 40
            },
            {
                "L", 50
            },
            {
                "xc", 90
            },
            {
                "C", 100
            },
            {
                "CD", 400
            },
            {
                "D", 500
            },
            {
                "CM", 900
            },
            {
                "M", 1000
            }
        };

        private string IntToRoman(int num)
        {
            return string.Concat(
                _romanNumerals.Reverse().Select((item =>
                {
                    int romanRepeat = num / item.Value;
                    num %= item.Value;
                    return string.Concat(Enumerable.Repeat(item.Key, romanRepeat)).ToUpper();
                })));
        }

        public static void Main(string[] args)
        {
            IntegerToRoman integerToRoman = new IntegerToRoman();

            Console.WriteLine(integerToRoman.IntToRoman(58));
        }
    }
}
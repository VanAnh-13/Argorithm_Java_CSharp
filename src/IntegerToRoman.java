import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    private static final Map<String, Integer> ROMAN_NUMERALS = new LinkedHashMap<>();

    static {
        ROMAN_NUMERALS.put("M", 1000);
        ROMAN_NUMERALS.put("CM", 900);
        ROMAN_NUMERALS.put("D", 500);
        ROMAN_NUMERALS.put("CD", 400);
        ROMAN_NUMERALS.put("C", 100);
        ROMAN_NUMERALS.put("XC", 90);
        ROMAN_NUMERALS.put("L", 50);
        ROMAN_NUMERALS.put("XL", 40);
        ROMAN_NUMERALS.put("X", 10);
        ROMAN_NUMERALS.put("IX", 9);
        ROMAN_NUMERALS.put("V", 5);
        ROMAN_NUMERALS.put("IV", 4);
        ROMAN_NUMERALS.put("I", 1);
    }

    public String intToRoman(int num) {
       StringBuilder result = new StringBuilder();

       for (Map.Entry<String, Integer> entry : ROMAN_NUMERALS.entrySet()) {
           int repeatRoman = num / entry.getValue();
           num %= entry.getValue();
           result.append(entry.getKey().repeat(repeatRoman));
       }

       return result.toString();
    }
}

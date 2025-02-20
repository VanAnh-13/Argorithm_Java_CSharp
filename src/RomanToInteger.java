import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> roman = new HashMap<>()  {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public int romanToInt(String s) {
        int result = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int current = roman.get(s.charAt(i));
            int next = (i + 1 < length) ? roman.get(s.charAt(i + 1)) : 0;
    
            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
}

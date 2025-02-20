import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> needPresent = new HashMap<>();
        for (Character c : t.toCharArray()) {
            needPresent.put(c, needPresent.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int count = 0;
        int start = 0, lengthSubstring = Integer.MAX_VALUE;
        Map<Character, Integer> window = new HashMap<>();

        while (right < s.length()) {
            char temporary = s.charAt(right);
            right++;

            if (needPresent.containsKey(temporary)) {
                window.put(temporary, window.getOrDefault(temporary, 0) + 1);

                if (window.get(temporary).equals(needPresent.get(temporary))) {
                    count++;
                }
            }

            while (count == needPresent.size()) {
                if (right - left < lengthSubstring) {
                    lengthSubstring = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);
                left++;

                if (needPresent.containsKey(leftChar)) {
                    if (needPresent.get(leftChar).equals(window.get(leftChar))) {
                        count--;
                    }

                    window.put(leftChar, window.get(leftChar) - 1);
                }
            }
        }

        return lengthSubstring == Integer.MAX_VALUE ? "" : s.substring(start, start + lengthSubstring);
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringConcatenationSolution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s.isEmpty() || words.length == 0) {
            return result;
        }

        int lengthWord = words[0].length(), totalWords = words.length;
        int totalLength = totalWords * lengthWord;

        Map<String, Integer> wordsPresent = new HashMap<>();
        for (String item : words) {
            wordsPresent.put(item, wordsPresent.getOrDefault(item, 0) + 1);
        }

        for (int i = 0; i < lengthWord; i++) {
            int left = i, right = i;
            Map<String, Integer> seen = new HashMap<>();

            while (right + lengthWord <= s.length()) {
                String currentWorld = s.substring(right, right + lengthWord);
                right += lengthWord;

                if (wordsPresent.containsKey(currentWorld)) {
                    seen.put(currentWorld, seen.getOrDefault(currentWorld, 0) + 1);

                    while (seen.get(currentWorld) > wordsPresent.get(currentWorld)){
                        String wordRemove = s.substring(left, left + lengthWord);
                        seen.put(wordRemove, seen.get(wordRemove) - 1);
                        left += lengthWord;
                    }

                    if (right - left == totalLength) {
                        result.add(left);
                    }
                } else {
                    seen.clear();
                    left  = right;
                }
            }
        }

        return result;
    }
}

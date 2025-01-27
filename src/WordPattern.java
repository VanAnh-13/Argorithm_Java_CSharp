import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class WordPattern {
    public static boolean isExistKey(char key, String value, Map<Character, String> mapCheck) {
        return mapCheck.entrySet()
                .stream().anyMatch(element -> element.getKey() != key && element.getValue().equals(value));
    }

    public boolean wordPattern(String pattern, String s) {
        String[] values = s.split(" ");

        if (values.length != pattern.length()) {
            return false;
        }
        
        Map<Character, String> words = new HashMap<>();

        return IntStream.range(0, pattern.length())
                .allMatch(index -> {
                    char key = pattern.charAt(index);
                    String value = values[index];
                    String mappedValue = words.get(key);

                    if ((mappedValue != null && !mappedValue.equals(value)) || isExistKey(key, value, words)) {
                        return false;
                    }

                    words.put(key, value);
                    return true;
                });
    }
}

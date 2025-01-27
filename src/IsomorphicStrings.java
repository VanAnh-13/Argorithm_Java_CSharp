import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class IsomorphicStrings {
    public static boolean isExistKey(char keyCheck, char valueCheck, Map<Character, Character> characterMap) {
        return characterMap.entrySet().stream().anyMatch(entry -> entry.getValue() == valueCheck && entry.getKey() != keyCheck);
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> characterMap = new HashMap<>();

        return IntStream.range(0, s.length())
                .allMatch(index -> {
                    char charKey = s.charAt(index);
                    char charValue = t.charAt(index);

                    Character mappedValue = characterMap.get(charKey);

                    if ((mappedValue != null && mappedValue != charValue) || (isExistKey(charKey, charValue, characterMap))) {
                        return false;
                    }

                    characterMap.put(charKey, charValue);
                    return true;
                });
    }

}

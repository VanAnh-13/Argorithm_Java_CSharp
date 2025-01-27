import java.util.HashMap;
import java.util.Map;

public class RanSomeNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineCharacter = new HashMap<>();

        magazine.chars().forEach(c -> magazineCharacter.put((char) c, magazineCharacter.getOrDefault((char) c, 0) + 1));

        return ransomNote.chars().allMatch(c -> {
            int count = magazineCharacter.getOrDefault((char) c, 0);

            if (count > 0) {
                magazineCharacter.put((char) c, count - 1);

                return true;
            }

            return false;
        });
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
    }
}

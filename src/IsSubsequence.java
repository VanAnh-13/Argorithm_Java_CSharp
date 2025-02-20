public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int[] indexMatch = {-1};

        return s.chars()
                .allMatch(c -> {
                    indexMatch[0] = t.indexOf(c, indexMatch[0] + 1);
                    return indexMatch[0] != -1;
                });
    }
}

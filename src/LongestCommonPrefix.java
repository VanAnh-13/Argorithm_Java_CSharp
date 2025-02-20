public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String pattern = strs[0];

        for (int i = 0; i < pattern.length(); i++) {
            char loopChar = pattern.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() || loopChar != strs[j].charAt(i)){
                    return pattern.substring(0, i);
                }
            }
        }

        return pattern;
    }
}

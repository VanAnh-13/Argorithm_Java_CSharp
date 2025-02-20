public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] sS = s.trim().split(" ");
        return sS[sS.length - 1].length();
    }
}

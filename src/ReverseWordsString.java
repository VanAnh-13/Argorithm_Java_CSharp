public class ReverseWordsString {
    public static String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        StringBuilder result = new StringBuilder();
        StringBuilder tem = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char charSi = s.charAt(i);

            if (charSi != ' ') {
                tem.append(charSi);
            } else {
                result.append(tem.reverse()).append(' ');
                tem.setLength(0);
            }
        }

        result.append(tem.reverse());

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}

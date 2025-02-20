public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            int increase = 2 * (numRows - 1);

            for (int j = i; j < s.length(); j += increase) {
                result.append(s.charAt(j));

                int tem = j + increase - (2 * i);
                if (i > 0 && i < numRows - 1 && tem < s.length()) {
                    result.append(s.charAt(tem));
                }
            }
        }

        return result.toString();
    }
}

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> results = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                results.add(s.charAt(i));
            } else if (results.isEmpty() || !isMatchingPair(results.pop(), s.charAt(i))) {
                return false;
            }
        }

        return results.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}

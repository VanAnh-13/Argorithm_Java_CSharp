public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        s = s.toLowerCase().trim().replaceAll("[^a-z0-9]", "");
        int left = 0, right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> visits = new HashSet<>();

        while (!visits.contains(n)) {
            visits.add(n);

            n = calculate(n);

            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    private int calculate(int n) {
        int output = 0;

        while (n > 0) {
            int digit = n % 10;
            output += (digit * digit);

            n /= 10;
        }

        return output;
    }
}

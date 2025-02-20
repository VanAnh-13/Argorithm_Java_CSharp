public class Pow {
    // Exponentiation by Squaring
    public static double calculate(double x, int n) {
        double result = 1D;
        long absN = Math.abs((long) n);

        while (absN > 0) {
            if (absN % 2 == 1) {
                result *= x;
            }

            x *= x;
            absN /= 2;
        }

        return result;
    }

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double result = calculate(x, n);
        return n < 0 ? 1 / result : result;
    }
}

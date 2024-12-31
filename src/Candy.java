import java.util.Arrays;

/**
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.<br>
 * You are giving candies to these children subjected to the following requirements: <br>
 * 1. Each child must have at least one candy.<br>
 * 2. Children with a higher rating get more candies than their neighbors.<br>
 * Return the minimum number of candies you need to have to distribute the candies to the children.<br>
 */
public class Candy {
    public static int candy(int... ratings) {
        int[] candyValues = new int[ratings.length];
        Arrays.fill(candyValues, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candyValues[i] = candyValues[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candyValues[i] = Integer.max(candyValues[i], candyValues[i + 1] + 1);
            }
        }

        return Arrays.stream(candyValues).sum();
    }
}

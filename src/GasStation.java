import java.util.Arrays;

/**
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].<br>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its
 * next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.<br><br>
 *
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction,
 * otherwise return -1. If there exists a solution, it is guaranteed to be unique.
 */
public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }

        int result = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            result += (gas[i] - cost[i]);

            if (result < 0) {
                result = 0;
                start = i + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }
}

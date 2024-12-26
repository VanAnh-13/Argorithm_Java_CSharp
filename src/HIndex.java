import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class HIndex {
    /**
     * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper,
     * return the researcher's h-index. <br>
     * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has
     * published at least h papers that have each been cited at least h times.
     * <br>Example 1:
     * <br>Input: citations = [3,0,6,1,5]
     * <br>Output: 3
     * <br>Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
     * <br>Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
     * <br>Example 2:
     * <br>Input: citations = [1,3,1]
     * <br>Output: 1
     */
    public static int hIndex(int... citations) {
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(0);
        sortedList.addAll(Arrays.stream(citations).boxed().sorted((a, b) -> b - a).toList());
        return (int) IntStream.range(1, sortedList.size()).filter(i -> sortedList.get(i) >= i).count();
    }

    public static void main(String[] args) {
        System.out.println(hIndex(1));
    }
}

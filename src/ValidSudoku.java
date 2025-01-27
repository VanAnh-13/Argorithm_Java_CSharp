import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char currentItem = board[row][column];
                String squareKey = (row / 3) + ", " + (column / 3);

                if (currentItem == '.') {
                    continue;
                }

                rows.putIfAbsent(row, new HashSet<>());
                columns.putIfAbsent(column, new HashSet<>());
                squares.putIfAbsent(squareKey, new HashSet<>());

                if (rows.get(row).contains(currentItem)
                        || columns.get(column).contains(currentItem)
                        || squares.get(squareKey).contains(currentItem)) {
                    return false;
                }

                rows.get(row).add(currentItem);
                columns.get(column).add(currentItem);
                squares.get(squareKey).add(currentItem);
            }
        }

        return true;
    }
}

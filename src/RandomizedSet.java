import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Implement the RandomizedSet class: <br>
 * <b>RandomizedSet() Initializes the RandomizedSet object. <br></b>
 * <b>bool insert(int val) Inserts an item val into the set if not present. </b><br>Returns true if the item was not present, false otherwise. <br> <br>
 * <b>bool remove(int val) Removes an item val from the set if present. </b><br>Returns true if the item was present, false otherwise. <br> <br>
 * <b>int getRandom()</b><br> Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). <br>
 * Each element must have the same probability of being returned. <br><br>
 * You must implement the functions of the class such that each function works in average O(1) time complexity. <br><br>
 */

class RandomizedSet {
    private final List<Integer> randomizedSet;

    public RandomizedSet() {
        this.randomizedSet = new ArrayList<>();
    }

    public boolean insert(int val) {
        boolean check = randomizedSet.stream().anyMatch(number -> number == val);
        if (!check) {
            this.randomizedSet.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        return this.randomizedSet.removeIf(number -> number == val);
    }

    public int getRandom() {
        if (this.randomizedSet.isEmpty()) {
            return 0;
        }

        return this.randomizedSet.stream()
                .skip(new Random().nextInt(this.randomizedSet.size()))
                .findFirst()
                .get();
    }
}
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> checked = new HashSet<>();

        while (head != null) {
            if (checked.contains(head)) {
                return true;
            }

            checked.add(head);
            head = head.next;
        }

        return false;
    }
}
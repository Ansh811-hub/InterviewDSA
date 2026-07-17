package OptimalApproachLL;
import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        LinkedListCycle obj = new LinkedListCycle();
        System.out.println(obj.hasCycle(head1));
    }
}

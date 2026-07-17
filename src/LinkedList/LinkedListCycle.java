package LinkedList;


class ListNode1{
    int val;
    ListNode next;

    ListNode1(int val) {
        this.val = val;
    }
}
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow == fast) {
            return true;
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
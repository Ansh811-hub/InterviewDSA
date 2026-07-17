package LinkedList;


class ListNode0{
    int val;
    ListNode next;

    ListNode0(int x) {
        val = x;
    }

    public class RemoveCycle {
        public ListNode hasCycle(ListNode head) {
            boolean hasCycle = false;

            if (head != null && head.next == null) {
                return null;
            }

            if (head == null || head.next == null) {
                return head;
            }
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    hasCycle = true;
                    break;
                }
            }
            if (!hasCycle) {
                return null;
            }
            slow = head;
            ListNode prev = null;
            while (slow != fast) {
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            prev.next = null; // REMOVE CYCLE
            return slow;
        }

        public void main(String[] args) {

            ListNode head1 = new ListNode(1);
            head1.next = new ListNode(3);
            head1.next.next = new ListNode(5);

            RemoveCycle obj = new RemoveCycle();
            ListNode head2 = obj.hasCycle(head1);
            System.out.println(head2);

        }
    }
}

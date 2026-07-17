package LinkedList;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static class LinkedListCycle2 {
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
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
        public static void main(String[] args) {

            ListNode head1 = new ListNode(1);
            head1.next = new ListNode(3);
            head1.next.next = new ListNode(5);

            LinkedListCycle2 obj = new LinkedListCycle2();
            ListNode head2 = obj.hasCycle(head1);
            System.out.println(head2);
        }
}
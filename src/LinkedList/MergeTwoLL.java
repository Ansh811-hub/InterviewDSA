package LinkedList;

class ListNode5 {
    int val;
    ListNode next;

    ListNode5(int val) {
        this.val = val;
    }
}

public class MergeTwoLL {
    public ListNode merge(ListNode head1, ListNode head2) {

        if (head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }

        if (head1.val <= head2.val) {
            head1.next = merge(head1.next, head2);
            return head1;
        } else {
            head2.next = merge(head1, head2.next);
            return head2;
        }
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // First Linked List
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        // Second Linked List
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);

        MergeTwoLL obj = new MergeTwoLL();
        ListNode mergedHead = obj.merge(head1, head2);
        print(mergedHead);
    }
}

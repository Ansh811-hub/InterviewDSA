package OptimalApproachLL;

public class RemoveNthNodeFromEndofLL {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            // Count the number of nodes
            int count = 0;
            ListNode temp = head;

            while (temp != null) {
                count++;
                temp = temp.next;
            }

            // If the head needs to be removed
            if (count == n) {
                return head.next;
            }

            // Move to the node just before the one to be deleted
            temp = head;
            for (int i = 1; i < count - n; i++) {
                temp = temp.next;
            }

            // Delete the nth node from the end
            temp.next = temp.next.next;
            return head;
        }
        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            RemoveNthNodeFromEndofLL obj = new RemoveNthNodeFromEndofLL();
            ListNode res = obj.removeNthFromEnd(head, 2);
            while(res != null){
                System.out.println(res.val);
                res = res.next;
            }
        }
    }


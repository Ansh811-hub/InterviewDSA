package LinkedList;

class ListNode4 {
    int val;
    ListNode next;
    ListNode4(int x) {
        val = x; }
}
public class RemoveNthNodefromEndofLL {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int cnt = 0;
            ListNode temp = head;

            if(temp == null || temp.next == null) {
                return null;
            }

            while(temp != null){
                cnt++;
                temp = temp.next;
            }

            int p =1;
            temp = head;
            while( p < cnt-n){
                temp = temp.next;
                p++;
            }

            if(cnt-n == 0){
                return temp.next;

            }

            temp.next = temp.next.next;
            return head;
        }
        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);

            RemoveNthNodefromEndofLL list = new RemoveNthNodefromEndofLL();
            head = list.removeNthFromEnd(head, 1);
            while(head != null){
                System.out.println(head.val);
                head = head.next;
            }
        }
}

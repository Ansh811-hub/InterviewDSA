package LinkedList;

class ListNode9 {
    int val;
    ListNode next;

    ListNode9(int val) {
        this.val = val;
    }
}
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        ListNode prev  = null;

        while(first != null && second != null){
            ListNode third = second .next;
            second.next = first;
            first.next = third;

            if(prev != null){
                prev.next = second;
            }else{
                head = second;
            }

            prev = first;
            first = third;
            if(third != null){
                second = third.next;
            }else{
                second = null;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        SwapNodesInPairs obj = new SwapNodesInPairs();
        ListNode ans = obj.swapPairs(head);

        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}

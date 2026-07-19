package LinkedList;

class ListNode6{
    int val;
    ListNode next;

    ListNode6(int val){
        this.val = val;
    }
}

public class PalindromeLL {
    public boolean getPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        String s = "";
        for (int i = sb.length() - 1; i >= 0; i--) {
            s += sb.charAt(i);
        }
        if (!s.equals(sb.toString())) {
            return false;
        }
        return true;
    }
        public static void main (String[]args){
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            head.next.next.next.next.next = new ListNode(6);

            PalindromeLL obj = new PalindromeLL();
            boolean result = obj.getPalindrome(head);
            System.out.println(result);
        }
    }

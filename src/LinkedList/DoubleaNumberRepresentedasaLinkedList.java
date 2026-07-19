package LinkedList;
import java.util.*;
import java.math.*;

class ListNode8{
    int val;
    ListNode next;
    ListNode8(int x){
        val = x;
    }
}
public class DoubleaNumberRepresentedasaLinkedList {
        public ListNode doubleIt(ListNode head) {

            if (head == null) {
                return null;
            }

            // Step 1: Convert Linked List to String
            StringBuilder sb = new StringBuilder();
            ListNode temp = head;

            while (temp != null) {
                sb.append(temp.val);
                temp = temp.next;
            }

            // Step 2: Convert String to BigInteger and Double it
            BigInteger num = new BigInteger(sb.toString());
            num = num.multiply(BigInteger.valueOf(2));

            // Step 3: Convert back to String
            String str = num.toString();

            // Step 4: Update existing nodes / create new ones if needed
            temp = head;
            ListNode prev = null;
            int i = 0;

            while (temp != null && i < str.length()) {
                temp.val = str.charAt(i) - '0';
                prev = temp;
                temp = temp.next;
                i++;
            }

            // Step 5: Add extra nodes if answer has more digits
            while (i < str.length()) {
                prev.next = new ListNode(str.charAt(i) - '0');
                prev = prev.next;
                i++;
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

        DoubleaNumberRepresentedasaLinkedList obj  = new DoubleaNumberRepresentedasaLinkedList();
        ListNode temp = obj.doubleIt(head);
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
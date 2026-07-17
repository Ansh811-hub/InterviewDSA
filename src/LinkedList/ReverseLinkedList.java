package LinkedList;
import java.util.Scanner;
import java.util.*;


public class ReverseLinkedList {
    public <ListNode> ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
//            next = curr.next;
//            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public <ListNode> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
    }
}

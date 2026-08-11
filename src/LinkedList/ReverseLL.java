package LinkedList;
import java.util.*;

class ListNode2 {
    int val;
    Node next;

    ListNode2(int val) {
        this.val = val;
    }
}

public class ReverseLL {
    public static Node Reverse(Node head) {

        if (head == null)
            return null;

        Stack<Node> stack = new Stack<>();
        Node temp = head;

        // Put all nodes into stack
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        // Last node becomes new head
        Node newHead = stack.pop();
        temp = newHead;

        // Reconnect nodes in reverse order
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }

        // Important: old head must point to null
        temp.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the linked list:");

        Node head = new Node(in.nextInt());
        head.next = new Node(in.nextInt());
        head.next.next = new Node(in.nextInt());
        head.next.next.next = new Node(in.nextInt());
        head.next.next.next.next = new Node(in.nextInt());

        Node huh = Reverse(head);

        // Print reversed list
        while (huh != null) {
            System.out.println(huh.data);
            huh = huh.next;
        }
    }
}
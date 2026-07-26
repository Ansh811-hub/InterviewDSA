package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class LengthofLL {
    public int length(ListNode head) {
        int cnt = 0;
        if (head == null) {
            return cnt;
        }
        ListNode cur = head;
        while (cur.next != null) {
            cnt++;
            cur = cur.next;
        }
        return cnt+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LengthofLL obj = new LengthofLL();
        ListNode head = new ListNode(sc.nextInt());
       head.next = new ListNode(sc.nextInt());
       head.next.next = new ListNode(sc.nextInt());
       head.next.next.next = new ListNode(sc.nextInt());
       head.next.next.next.next = new ListNode(sc.nextInt());

        System.out.println(obj.length(head));
    }
}

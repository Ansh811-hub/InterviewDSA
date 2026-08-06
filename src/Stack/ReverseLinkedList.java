//package Stack;
//import org.w3c.dom.Node;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Stack;
//
//public class ReverseLinkedList{
//    public Node Reverse(Node head) {
//
//        if (head == null)
//            return null;
//
//        Stack<Node> stack = new Stack<>();
//        Node temp = head;
//
//        while (temp != null) {
//            stack.push(temp);
//            temp = temp.next;
//        }
//
//        Node newHead = stack.pop();
//        temp = newHead;
//        while (!stack.isEmpty()) {
//            temp.next = stack.pop();
//            temp = temp.next;
//        }
//        temp.next = null;
//        return newHead;
//    }
//
//    public static void main(String[] args) {
//
//
//    }
//}
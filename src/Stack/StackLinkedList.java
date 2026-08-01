package Stack;

import java.util.Scanner;

public class StackLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {
        private Node head;

        // Check if stack is empty
        public boolean isEmpty() {
            return head == null;
        }

        // Push element
        public void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // Pop element
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        stack.push(1);
        System.out.println("Enter 4 numbers:");
        for (int i = 0; i < 4; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("\nStack Elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
        sc.close();
    }
}
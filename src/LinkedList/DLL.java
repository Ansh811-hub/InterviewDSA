package LinkedList;

class DLL {

    // Node class
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head, tail;

    // Push Front
    public void pushFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Push Back
    public void pushBack(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Pop Front
    public void popFront() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Pop Back
    public void popBack() {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // Display Forward
    public void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Display Backward
    public void displayBackward() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    // Main Method
    public static void main(String[] args) {

        DLL dll = new DLL();

        dll.pushFront(20);
        dll.pushFront(10);
        dll.pushBack(30);
        dll.pushBack(40);

        System.out.println("Forward:");
        dll.displayForward();

        System.out.println("Backward:");
        dll.displayBackward();

        dll.popFront();
        System.out.println("\nAfter Pop Front:");
        dll.displayForward();

        dll.popBack();
        System.out.println("\nAfter Pop Back:");
        dll.displayForward();
    }
}
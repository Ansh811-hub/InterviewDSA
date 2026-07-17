package LinkedList;

import java.util.LinkedList;

public class MiddleOfLinkedList {

    public static int middleNode(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        return list.get(list.size() / 2);
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        int middle = middleNode(list);

        System.out.println("Middle Element: " + middle);
    }
}
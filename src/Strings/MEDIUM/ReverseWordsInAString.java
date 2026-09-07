package Strings.MEDIUM;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsInAString {
    public static String reverse(String s) {

        Stack<String> stack = new Stack<>();
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!word.isEmpty()) {
                    stack.push(word);
                    word = "";
                }
            } else {
                word = word + s.charAt(i);
            }
        }

        // Add the last word
        if (!word.isEmpty()) {
            stack.push(word);
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println(reverse(str));
    }
}
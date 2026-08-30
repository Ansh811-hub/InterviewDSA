package Strings.MEDIUM;
import java.util.Scanner;
import java.util.Stack;

public class RemoveOuterMostParanthesis {
    public static String most(String s) {
        Stack<Character> p = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (!p.isEmpty()) {
                    result.append('(');
                }
                p.push('(');
            } else {
                p.pop();
                if (!p.isEmpty()) {
                    result.append(')');
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.nextLine();
        most(str);
    }
}
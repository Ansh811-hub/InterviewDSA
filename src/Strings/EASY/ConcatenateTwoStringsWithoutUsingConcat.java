package Strings.EASY;

import java.util.Scanner;

public class ConcatenateTwoStringsWithoutUsingConcat {
    public static void valid(String s1, String s2) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            s.append(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            s.append(s2.charAt(i));
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = input.nextLine();
        System.out.println("Enter a string");
        String s2 = input.nextLine();
        valid(s1,s2);
    }
}

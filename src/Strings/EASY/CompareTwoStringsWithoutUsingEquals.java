package Strings.EASY;

import java.util.Scanner;

public class CompareTwoStringsWithoutUsingEquals {
    public static boolean valid(String s1,String s2){
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();
        System.out.println("Enter a string");
        String t = input.nextLine();
        valid(s,t);
    }
}

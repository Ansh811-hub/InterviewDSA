package Strings.EASY;

import java.util.Scanner;

public class CheckWhetheraStringIsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();

// Reverse the string and check if it equals the original
        boolean isPalindrome = s.equals(new StringBuilder(s).reverse().toString());
        System.out.println(isPalindrome);
    }
}

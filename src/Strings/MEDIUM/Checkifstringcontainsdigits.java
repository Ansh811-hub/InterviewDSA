package Strings.MEDIUM;

import java.util.Scanner;

public class Checkifstringcontainsdigits {
    public static void digits(String s) {
        boolean allDigits = true;
        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) {
                allDigits = false;
                break;
            }
        }
        if (allDigits) {
            System.out.println("All are digits");
        } else {
            System.out.println("Not a digit");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        digits(s);
    }

}

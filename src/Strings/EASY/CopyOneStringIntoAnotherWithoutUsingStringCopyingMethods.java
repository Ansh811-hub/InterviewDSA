package Strings.EASY;

import java.util.Scanner;

public class CopyOneStringIntoAnotherWithoutUsingStringCopyingMethods {
    public static void valid(String source){

        // 1. Create a character array of the same length
        char[] destinationChars = new char[source.length()];

        // 2. Copy character by character using a loop
        for (int i = 0; i < source.length(); i++) {
            destinationChars[i] = source.charAt(i);
        }

        // 3. Convert the character array back into a new String
        String destination = new String(destinationChars);

        System.out.println("Copied String: " + destination);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();
        valid(s);
    }
}

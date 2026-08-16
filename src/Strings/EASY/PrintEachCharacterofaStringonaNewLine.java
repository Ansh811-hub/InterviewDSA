package Strings.EASY;

import java.util.Scanner;

public class PrintEachCharacterofaStringonaNewLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string to print by character in new line");
        String str = input.nextLine();
        for (int j = 0; j < str.length(); j++) {
            System.out.println(str.charAt(j));
        }
    }
}

package Strings.EASY;

import java.util.Scanner;

public class CountVowelsAndConsonantsInaString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        int consonants = 0;
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||  str.charAt(i) == 'u') {
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("total number of vowels in string");
        System.out.println(vowels);
        System.out.println("total number of consonants in string");
        System.out.println(consonants);
    }
}

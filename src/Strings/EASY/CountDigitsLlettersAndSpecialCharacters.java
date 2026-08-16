package Strings.EASY;

import java.util.Scanner;

public class CountDigitsLlettersAndSpecialCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        int chac = 0;
        int digits = 0;
        int spech = 0;

        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                chac++;
            } else if(Character.isDigit(str.charAt(i))) {
                digits++;
            }else{
                spech++;
            }
        }
        System.out.println("total number of letters in string");
        System.out.println(chac);
        System.out.println("total number of digits in string");
        System.out.println(digits);
        System.out.println("total number of special characters in string");
        System.out.println(spech);
    }
}
